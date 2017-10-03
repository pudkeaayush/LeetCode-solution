class ValidWordAbbr {
    HashMap < String , ArrayList < String > > map = new HashMap < String , ArrayList <String>  >();

    public ValidWordAbbr(String[] dictionary) {
        for( String s : dictionary) {
            StringBuilder temp = new StringBuilder();
            int count = 0;
            for( int i = 0; i < s.length(); i++) {
                if(i != 0 && i != s.length() - 1)
                    count++;
            }
            if(s.length() > 1) {
                temp.append(s.charAt(0));
                temp.append(count);
                temp.append(s.charAt(s.length() - 1));
            } else if(s.length() == 1)
                temp.append(s.charAt(0));
            if(map.containsKey(temp.toString()))
                map.get(temp.toString()).add(s);
            else {
                map.put(temp.toString() , new ArrayList < String >());
                map.get(temp.toString()).add(s);
            }
        }
        
    }
    
    public boolean isUnique(String word) {
        int count = 0;
        for( int i = 0; i < word.length(); i++) {
                if(i != 0 && i != word.length() - 1)
                    count++;
        }
        StringBuilder temp = new StringBuilder();
        if(word.length() > 1) {
                temp.append(word.charAt(0));
                temp.append(count);
                temp.append(word.charAt(word.length() - 1));
            } else if(word.length() == 1)
                temp.append(word.charAt(0));
            else
                return true;
        if(!map.containsKey(temp.toString()) )
            return true;
        else {
            List < String > list = map.get(temp.toString());
            Set < String > set = new HashSet < String >(list);
            for( String s : list) {
                if(s.equals(word) && set.size() == 1)
                    return true;
            }
            return false;
        }
    }
}
