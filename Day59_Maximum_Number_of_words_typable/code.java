class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" ");
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            int flag=0;
            for(int j=0; j<brokenLetters.length(); j++)
            {
                if(arr[i].contains(String.valueOf(brokenLetters.charAt(j))))
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                count++;
            }
        }
        return count;
    }
}
