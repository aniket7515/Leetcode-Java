class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();
        
        for(int i=0;i<secret.length();i++){
            map1.put(secret.charAt(i), map1.getOrDefault(secret.charAt(i),0)+1);
        }
        for(int i=0;i<guess.length();i++){
            map2.put(guess.charAt(i), map2.getOrDefault(guess.charAt(i),0)+1);
        }
        int i=0;
        int j=0;
        int cnt=0;
        HashSet<Integer> set= new HashSet<>();
        while(i<secret.length() && j<guess.length()){
            if(secret.charAt(i)==guess.charAt(j)){
                set.add(i);
                cnt++;
                if(map1.get(secret.charAt(i))==1) map1.remove(secret.charAt(i));
                else map1.put(secret.charAt(i), map1.get(secret.charAt(i))-1);
                if(map2.get(guess.charAt(j))==1) map2.remove(guess.charAt(j));
               else  map2.put(guess.charAt(j), map2.get(guess.charAt(j))-1);
            }
            i++;
            j++;
        }
        StringBuilder sb= new StringBuilder();
        sb.append(cnt);
        sb.append("A");
        
        int cnt1=0;
        i=0;
        HashSet set1= new HashSet<>();
       for(i=0;i<secret.length();i++){
            if(set.contains(i)) continue;
            if(map2.containsKey(secret.charAt(i)) && !set1.contains(secret.charAt(i))){
                int min=Math.min(map1.get(secret.charAt(i)), map2.get(secret.charAt(i)));
                 
                if(map2.get(secret.charAt(i))==1) map2.remove(secret.charAt(i));
               else  map2.put(secret.charAt(i), map2.get(secret.charAt(i))-min);
                cnt1+=min;
                set1.add(secret.charAt(i));
            }
            
        }
        sb.append(cnt1);
        sb.append("B");
        
        return sb.toString();
        
    }
}