class Solution
{
    public static int prefixSuffixString(String s1[],String s2[])
    {
        int count = 0;
        for(String ins2:s2)
        {
            for(String ins1:s1)
            {
                int s1length = ins1.length();
                int s2length = ins2.length();
                if(s1length>s2length)
                {
                    String pref = ins1.substring(0,s2length);
                    String suff = ins1.substring(s1length-s2length);
                    if(pref.equals(ins2) || suff.equals(ins2))
                    {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}    
