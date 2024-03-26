class Solution {
    public int numUniqueEmails(String[] emails) {
      Set<String>set= new HashSet<>();
        for(String email:emails){
            String forMated = getFormatedString(email);
            set.add(forMated);
        }
        
        return set.size();
        
    }
    
    private String getFormatedString(String emails){
        
        String[] sp = emails.split("@");
        String localName=sp[0];
        String domainName=sp[1];
        
       String[] localSp= localName.split("\\+");
        localName=localSp[0];
        
       localName=localName.replace(".","");
        
        return localName+'@'+domainName;
    }
}