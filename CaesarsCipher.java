
public class CaesarsCipher {
    
		StringBuilder sb = new StringBuilder();
	
	
	public void cipher(String message, int numOfShifts){
		message = message.toUpperCase();  //all letters upper case
		char[] charArray = message.toCharArray();
		for (int i=0; i<charArray.length; i++){
			
			if(Character.isLetter(charArray[i])){  
				if(charArray[i]+numOfShifts>'Z'){
					charArray[i]=(char) (charArray[i]-26);
				}
			sb.append((char)(charArray[i]+numOfShifts));
			
			}
			else sb.append(charArray[i]);   //non letter characters
			
		}
		System.out.println(sb);
	}

}

