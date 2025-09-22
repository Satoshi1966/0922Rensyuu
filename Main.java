public class Main {
	  public static void main(String[] args)throws Exception {
		  
		  String str = "AppleOrangeMelon";//任意の文字列をセット	        
		  if(str.matches(".*Apple.*"))//キーワードが含まれていればmatched
	        {
	            System.out.println( str + "にキーワードが含まれています");
	        }else {
	        	System.out.println( str + "にキーワードが含まれていません");
	        }

          // name変数を追加してパターンマッチを実行
          String name = "A12UABC"; // テスト用の文字列
          if(name.matches("[.*][A\\d{1,2}]U[A-Z]{3}")) {
              System.out.println(name + "はパターンにマッチしました");
          } else {
              System.out.println(name + "はパターンにマッチしませんでした");
          }
	    }  
	  }