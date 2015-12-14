/* The following code was generated by JFlex 1.6.1 */

package main;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/UFPE/2015.2/IF688 - Teo. Implement. Ling. Computacionais/Workspace/Compilador_Minijava/cfg/lexer.jflex</tt>
 */
public class Lexer implements ParserSym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int CODESEG = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\4\1\62\1\62\1\1\22\0\1\1\1\56\3\0"+
    "\1\61\1\55\1\0\1\17\1\20\1\3\1\12\1\15\1\13\1\10"+
    "\1\2\1\6\11\7\1\0\1\14\1\57\1\16\1\60\2\0\4\5"+
    "\1\11\15\5\1\44\7\5\1\23\1\0\1\24\1\0\1\5\1\0"+
    "\1\27\1\33\1\25\1\41\1\35\1\53\1\46\1\50\1\34\2\5"+
    "\1\26\1\47\1\40\1\43\1\31\1\5\1\45\1\30\1\37\1\32"+
    "\1\42\1\52\1\36\1\51\1\5\1\21\1\54\1\22\7\0\1\62"+
    "\u1fa2\0\1\62\1\62\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\2\6\1\7"+
    "\1\5\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\17\5\2\1\1\23\1\24"+
    "\1\25\1\26\5\0\1\27\6\5\1\30\14\5\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\2\0\3\37\5\5"+
    "\1\40\4\5\1\41\7\5\1\0\5\5\1\42\1\5"+
    "\1\43\1\44\1\45\3\5\1\46\2\5\1\36\1\47"+
    "\10\5\1\50\1\51\1\52\1\53\1\54\2\5\1\55"+
    "\1\5\1\56\1\57\1\60\13\0\1\61";

  private static int [] zzUnpackAction() {
    int [] result = new int[147];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\63\0\146\0\63\0\231\0\314\0\377"+
    "\0\63\0\u0132\0\63\0\63\0\63\0\63\0\u0165\0\63"+
    "\0\63\0\63\0\63\0\63\0\63\0\u0198\0\u01cb\0\u01fe"+
    "\0\u0231\0\u0264\0\u0297\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396"+
    "\0\u03c9\0\u03fc\0\u042f\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e"+
    "\0\u0561\0\63\0\u0594\0\u05c7\0\314\0\u05fa\0\u062d\0\63"+
    "\0\u0660\0\u0693\0\u06c6\0\u06f9\0\u072c\0\u075f\0\231\0\u0792"+
    "\0\u07c5\0\u07f8\0\u082b\0\u085e\0\u0891\0\u08c4\0\u08f7\0\u092a"+
    "\0\u095d\0\u0990\0\u09c3\0\63\0\63\0\63\0\63\0\63"+
    "\0\63\0\u09f6\0\u0a29\0\u0a29\0\63\0\u0a5c\0\u0a8f\0\u0ac2"+
    "\0\u0af5\0\u0b28\0\u0b5b\0\231\0\u0b8e\0\u0bc1\0\u0bf4\0\u0c27"+
    "\0\231\0\u0c5a\0\u0c8d\0\u0cc0\0\u0cf3\0\u0d26\0\u0d59\0\u0d8c"+
    "\0\u0dbf\0\u0df2\0\u0e25\0\u0e58\0\u0e8b\0\u0ebe\0\231\0\u0ef1"+
    "\0\231\0\231\0\231\0\u0f24\0\u0f57\0\u0f8a\0\231\0\u0fbd"+
    "\0\u0ff0\0\u09f6\0\231\0\u1023\0\u1056\0\u1089\0\u10bc\0\u10ef"+
    "\0\u1122\0\u1155\0\u1188\0\231\0\231\0\231\0\231\0\231"+
    "\0\u11bb\0\u11ee\0\231\0\u1221\0\231\0\231\0\231\0\u1254"+
    "\0\u1287\0\u12ba\0\u12ed\0\u1320\0\u1353\0\u1386\0\u13b9\0\u13ec"+
    "\0\u141f\0\u1452\0\63";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[147];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\3\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\6"+
    "\1\30\1\31\1\6\1\32\1\33\1\34\1\6\1\35"+
    "\1\36\1\6\1\37\1\6\1\40\1\41\1\6\1\42"+
    "\2\6\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\66\0\1\53\1\54\64\0\3\6\1\0\1\6"+
    "\13\0\27\6\15\0\2\55\1\56\60\0\2\10\1\56"+
    "\57\0\3\6\1\0\1\12\2\57\11\0\27\6\25\0"+
    "\1\60\51\0\3\6\1\0\1\6\13\0\1\6\1\61"+
    "\25\6\14\0\3\6\1\0\1\6\13\0\10\6\1\62"+
    "\16\6\14\0\3\6\1\0\1\6\13\0\12\6\1\63"+
    "\14\6\14\0\3\6\1\0\1\6\13\0\5\6\1\64"+
    "\21\6\14\0\3\6\1\0\1\6\13\0\16\6\1\65"+
    "\10\6\14\0\3\6\1\0\1\6\13\0\13\6\1\66"+
    "\12\6\1\67\14\0\3\6\1\0\1\6\13\0\1\6"+
    "\1\70\7\6\1\71\15\6\14\0\3\6\1\0\1\6"+
    "\13\0\20\6\1\72\2\6\1\73\3\6\14\0\3\6"+
    "\1\0\1\6\13\0\10\6\1\74\16\6\14\0\3\6"+
    "\1\0\1\6\13\0\16\6\1\75\10\6\14\0\3\6"+
    "\1\0\1\6\13\0\12\6\1\76\11\6\1\77\2\6"+
    "\14\0\3\6\1\0\1\6\13\0\10\6\1\100\16\6"+
    "\14\0\3\6\1\0\1\6\13\0\2\6\1\101\24\6"+
    "\14\0\3\6\1\0\1\6\13\0\23\6\1\102\3\6"+
    "\14\0\3\6\1\0\1\6\13\0\2\6\1\103\24\6"+
    "\63\0\1\104\63\0\1\105\23\0\1\106\62\0\1\107"+
    "\62\0\1\110\44\0\4\53\1\111\56\53\63\112\6\0"+
    "\1\113\1\114\1\56\60\0\1\115\1\116\2\0\2\57"+
    "\54\0\3\6\1\0\1\6\13\0\2\6\1\117\24\6"+
    "\14\0\3\6\1\0\1\6\13\0\13\6\1\120\13\6"+
    "\14\0\3\6\1\0\1\6\13\0\2\6\1\121\24\6"+
    "\14\0\3\6\1\0\1\6\13\0\6\6\1\122\20\6"+
    "\14\0\3\6\1\0\1\6\13\0\16\6\1\123\10\6"+
    "\14\0\3\6\1\0\1\6\13\0\12\6\1\124\14\6"+
    "\14\0\3\6\1\0\1\6\13\0\3\6\1\125\23\6"+
    "\14\0\3\6\1\0\1\6\13\0\12\6\1\126\14\6"+
    "\14\0\3\6\1\0\1\6\13\0\5\6\1\127\21\6"+
    "\14\0\3\6\1\0\1\6\13\0\7\6\1\130\17\6"+
    "\14\0\3\6\1\0\1\6\13\0\25\6\1\131\1\6"+
    "\14\0\3\6\1\0\1\6\13\0\7\6\1\132\17\6"+
    "\14\0\3\6\1\0\1\6\13\0\20\6\1\133\6\6"+
    "\14\0\3\6\1\0\1\6\13\0\3\6\1\134\23\6"+
    "\14\0\3\6\1\0\1\6\13\0\12\6\1\135\14\6"+
    "\14\0\3\6\1\0\1\6\13\0\7\6\1\136\17\6"+
    "\14\0\3\6\1\0\1\6\13\0\7\6\1\137\17\6"+
    "\14\0\3\6\1\0\1\6\13\0\1\6\1\140\25\6"+
    "\7\0\3\112\1\141\57\112\6\0\1\113\1\114\61\0"+
    "\2\116\60\0\3\6\1\0\1\6\13\0\3\6\1\142"+
    "\23\6\14\0\3\6\1\0\1\6\13\0\21\6\1\143"+
    "\5\6\14\0\3\6\1\0\1\6\13\0\12\6\1\144"+
    "\14\6\14\0\3\6\1\0\1\6\13\0\1\6\1\145"+
    "\25\6\14\0\3\6\1\0\1\6\13\0\1\6\1\146"+
    "\25\6\14\0\3\6\1\0\1\6\13\0\10\6\1\147"+
    "\16\6\14\0\3\6\1\0\1\6\13\0\10\6\1\150"+
    "\16\6\14\0\3\6\1\0\1\6\13\0\10\6\1\151"+
    "\16\6\14\0\3\6\1\0\1\6\13\0\3\6\1\152"+
    "\23\6\14\0\3\6\1\0\1\6\13\0\14\6\1\153"+
    "\12\6\14\0\3\6\1\0\1\6\13\0\7\6\1\154"+
    "\17\6\14\0\3\6\1\0\1\6\13\0\12\6\1\155"+
    "\14\6\14\0\3\6\1\0\1\6\13\0\5\6\1\156"+
    "\21\6\14\0\3\6\1\0\1\6\13\0\13\6\1\157"+
    "\13\6\14\0\3\6\1\0\1\6\13\0\1\6\1\160"+
    "\25\6\14\0\3\6\1\0\1\6\13\0\3\6\1\161"+
    "\23\6\7\0\2\112\1\162\1\141\57\112\5\0\3\6"+
    "\1\0\1\6\13\0\3\6\1\163\23\6\14\0\3\6"+
    "\1\0\1\6\13\0\12\6\1\164\14\6\14\0\3\6"+
    "\1\0\1\6\13\0\7\6\1\165\17\6\14\0\3\6"+
    "\1\0\1\6\13\0\7\6\1\166\17\6\14\0\3\6"+
    "\1\0\1\6\13\0\10\6\1\167\16\6\14\0\3\6"+
    "\1\0\1\6\13\0\13\6\1\170\13\6\14\0\3\6"+
    "\1\0\1\6\13\0\13\6\1\171\13\6\14\0\3\6"+
    "\1\0\1\6\13\0\10\6\1\172\16\6\14\0\3\6"+
    "\1\0\1\6\13\0\20\6\1\173\6\6\14\0\3\6"+
    "\1\0\1\6\13\0\10\6\1\174\16\6\14\0\3\6"+
    "\1\0\1\6\13\0\10\6\1\175\16\6\14\0\3\6"+
    "\1\0\1\6\13\0\23\6\1\176\3\6\14\0\3\6"+
    "\1\0\1\6\13\0\1\177\26\6\14\0\3\6\1\0"+
    "\1\6\13\0\1\200\26\6\14\0\3\6\1\0\1\6"+
    "\13\0\2\6\1\201\24\6\14\0\3\6\1\0\1\6"+
    "\13\0\14\6\1\202\12\6\14\0\3\6\1\0\1\6"+
    "\13\0\21\6\1\203\5\6\14\0\3\6\1\0\1\6"+
    "\13\0\22\6\1\204\4\6\14\0\3\6\1\0\1\6"+
    "\13\0\13\6\1\205\13\6\14\0\3\6\1\0\1\6"+
    "\13\0\13\6\1\206\13\6\14\0\3\6\1\0\1\6"+
    "\13\0\3\6\1\207\23\6\14\0\3\6\1\210\1\6"+
    "\13\0\27\6\52\0\1\211\51\0\1\212\67\0\1\213"+
    "\33\0\1\214\103\0\1\215\76\0\1\216\51\0\1\217"+
    "\66\0\1\220\61\0\1\221\51\0\1\222\74\0\1\223"+
    "\22\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5253];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\1\1\11\3\1\1\11\1\1\4\11"+
    "\1\1\6\11\24\1\1\11\5\0\1\11\23\1\6\11"+
    "\2\0\1\1\1\11\23\1\1\0\46\1\13\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[147];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
    public Lexer(java.io.InputStream in) {
        this(new java.io.InputStreamReader(in));
      }

	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 180) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {     return symbolFactory.newSymbol("EOF",ParserSym.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("\nERRO:"+yytext() );
            }
          case 50: break;
          case 2: 
            { /*Ignorado*/
            }
          case 51: break;
          case 3: 
            { return symbolFactory.newSymbol("A_DIV",A_DIV);
            }
          case 52: break;
          case 4: 
            { return symbolFactory.newSymbol("A_MULT",A_MULT);
            }
          case 53: break;
          case 5: 
            { return symbolFactory.newSymbol("IDENTIFICADOR",IDENTIFICADOR,yytext());
            }
          case 54: break;
          case 6: 
            { return symbolFactory.newSymbol("LITERAL_INTEIRO",LITERAL_INTEIRO,yytext());
            }
          case 55: break;
          case 7: 
            { return symbolFactory.newSymbol("PONTO",PONTO);
            }
          case 56: break;
          case 8: 
            { return symbolFactory.newSymbol("A_PLUS",A_PLUS);
            }
          case 57: break;
          case 9: 
            { return symbolFactory.newSymbol("A_MINUS",A_MINUS);
            }
          case 58: break;
          case 10: 
            { return symbolFactory.newSymbol("PONTOVIRGULA",PONTOVIRGULA);
            }
          case 59: break;
          case 11: 
            { return symbolFactory.newSymbol("VIRGULA",VIRGULA);
            }
          case 60: break;
          case 12: 
            { return symbolFactory.newSymbol("IGUAL",IGUAL);
            }
          case 61: break;
          case 13: 
            { return symbolFactory.newSymbol("PARENT_ESQ",PARENT_ESQ);
            }
          case 62: break;
          case 14: 
            { return symbolFactory.newSymbol("PARENT_DIR",PARENT_DIR);
            }
          case 63: break;
          case 15: 
            { return symbolFactory.newSymbol("CURLY_ESQ",CURLY_ESQ);
            }
          case 64: break;
          case 16: 
            { return symbolFactory.newSymbol("CURLY_DIR",CURLY_DIR);
            }
          case 65: break;
          case 17: 
            { return symbolFactory.newSymbol("COLCHE_ESQ",COLCHE_ESQ);
            }
          case 66: break;
          case 18: 
            { return symbolFactory.newSymbol("COLCHE_DIR",COLCHE_DIR);
            }
          case 67: break;
          case 19: 
            { return symbolFactory.newSymbol("OP_NOT",OP_NOT);
            }
          case 68: break;
          case 20: 
            { return symbolFactory.newSymbol("OP_LT",OP_LT);
            }
          case 69: break;
          case 21: 
            { return symbolFactory.newSymbol("OP_GT",OP_GT);
            }
          case 70: break;
          case 22: 
            { return symbolFactory.newSymbol("A_MOD",A_MOD);
            }
          case 71: break;
          case 23: 
            { return symbolFactory.newSymbol("OP_EQ",OP_EQ);
            }
          case 72: break;
          case 24: 
            { return symbolFactory.newSymbol("K_IF",K_IF);
            }
          case 73: break;
          case 25: 
            { return symbolFactory.newSymbol("OP_OR",OP_OR);
            }
          case 74: break;
          case 26: 
            { return symbolFactory.newSymbol("OP_AND",OP_AND);
            }
          case 75: break;
          case 27: 
            { return symbolFactory.newSymbol("OP_DIF",OP_DIF);
            }
          case 76: break;
          case 28: 
            { return symbolFactory.newSymbol("OP_LET",OP_LET);
            }
          case 77: break;
          case 29: 
            { return symbolFactory.newSymbol("OP_GET",OP_GET);
            }
          case 78: break;
          case 30: 
            { 
            }
          case 79: break;
          case 31: 
            { return symbolFactory.newSymbol("LITERAL_FLUTUANTE",LITERAL_FLUTUANTE,yytext());
            }
          case 80: break;
          case 32: 
            { return symbolFactory.newSymbol("T_INT",T_INT);
            }
          case 81: break;
          case 33: 
            { return symbolFactory.newSymbol("K_NEW",K_NEW);
            }
          case 82: break;
          case 34: 
            { return symbolFactory.newSymbol("K_ELSE",K_ELSE);
            }
          case 83: break;
          case 35: 
            { return symbolFactory.newSymbol("B_TRUE",B_TRUE);
            }
          case 84: break;
          case 36: 
            { return symbolFactory.newSymbol("K_THIS",K_THIS);
            }
          case 85: break;
          case 37: 
            { return symbolFactory.newSymbol("T_VOID",T_VOID);
            }
          case 86: break;
          case 38: 
            { return symbolFactory.newSymbol("K_MAIN",K_MAIN);
            }
          case 87: break;
          case 39: 
            { return symbolFactory.newSymbol("K_CLASS",K_CLASS);
            }
          case 88: break;
          case 40: 
            { return symbolFactory.newSymbol("K_WHILE",K_WHILE);
            }
          case 89: break;
          case 41: 
            { return symbolFactory.newSymbol("B_FALSE",B_FALSE);
            }
          case 90: break;
          case 42: 
            { return symbolFactory.newSymbol("K_LENGTH",K_LENGTH);
            }
          case 91: break;
          case 43: 
            { return symbolFactory.newSymbol("K_STATIC",K_STATIC);
            }
          case 92: break;
          case 44: 
            { return symbolFactory.newSymbol("K_PUBLIC",K_PUBLIC);
            }
          case 93: break;
          case 45: 
            { return symbolFactory.newSymbol("T_STRING",T_STRING);
            }
          case 94: break;
          case 46: 
            { return symbolFactory.newSymbol("K_RETURN",K_RETURN);
            }
          case 95: break;
          case 47: 
            { return symbolFactory.newSymbol("T_BOOLEAN",T_BOOLEAN);
            }
          case 96: break;
          case 48: 
            { return symbolFactory.newSymbol("K_EXTENDS",K_EXTENDS);
            }
          case 97: break;
          case 49: 
            { return symbolFactory.newSymbol("K_PRINT",K_PRINT);
            }
          case 98: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
