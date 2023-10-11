// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/java/org/apache/lucene/analysis/classic/ClassicTokenizerImpl.jflex

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.lucene.analysis.classic;

import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

/** This class implements the classic lucene StandardTokenizer up until 3.0 */

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings({"fallthrough", "unused"})
class ClassicTokenizerImpl {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 4096;

  /** Lexical states. */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l ZZ_LEXSTATE[l+1] is the state in
   * the DFA for the lexical state l at the beginning of a line l is of the form l = 2*k, k a non
   * negative integer
   */
  private static final int ZZ_LEXSTATE[] = {0, 0};

  /** Top-level table for translating characters to character classes */
  private static final int[] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
      "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"
          + "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"
          + "\1\u1000\1\u1100\1\u1200\1\u1300\1\u1400\1\u0100\1\u1500\1\u1600"
          + "\1\u1700\5\u0800\1\u1800\1\u1900\1\u1a00\1\u1b00\16\u0800\1\u1c00"
          + "\1\u1d00\1\u0800\1\u1e00\31\u1f00\1\u2000\121\u1f00\1\u2100\4\u0100"
          + "\1\u2200\7\u0800\53\u0100\1\u2300\41\u0800\1\u1f00\1\u2400\1\u2500"
          + "\1\u0100\1\u2600\1\u2700\1\u2800\u1000\u0800";

  private static int[] zzUnpackcmap_top() {
    int[] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int[] result) {
    int i = 0; /* index in packed string  */
    int j = offset; /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value;
      while (--count > 0);
    }
    return j;
  }

  /** Second-level tables for translating characters to character classes */
  private static final int[] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
      "\46\0\1\1\1\2\4\0\1\3\1\4\1\5\1\3"
          + "\12\6\6\0\1\7\32\10\4\0\1\11\1\0\32\10"
          + "\57\0\1\10\12\0\1\10\4\0\1\10\5\0\27\10"
          + "\1\0\37\10\1\0\u0128\10\2\0\22\10\34\0\136\10"
          + "\2\0\11\10\2\0\7\10\16\0\2\10\16\0\5\10"
          + "\11\0\1\10\213\0\1\10\13\0\1\10\1\0\3\10"
          + "\1\0\1\10\1\0\24\10\1\0\54\10\1\0\10\10"
          + "\2\0\32\10\14\0\202\10\12\0\71\10\2\0\2\10"
          + "\2\0\2\10\3\0\46\10\2\0\2\10\67\0\46\10"
          + "\2\0\1\10\7\0\47\10\110\0\33\10\5\0\3\10"
          + "\56\0\32\10\5\0\13\10\25\0\12\6\7\0\143\10"
          + "\1\0\1\10\17\0\2\10\11\0\12\6\3\10\23\0"
          + "\1\10\1\0\33\10\123\0\46\10\u015f\0\65\10\3\0"
          + "\1\10\22\0\1\10\7\0\12\10\4\0\12\6\25\0"
          + "\10\10\2\0\2\10\2\0\26\10\1\0\7\10\1\0"
          + "\1\10\3\0\4\10\42\0\2\10\1\0\3\10\4\0"
          + "\12\6\2\10\23\0\6\10\4\0\2\10\2\0\26\10"
          + "\1\0\7\10\1\0\2\10\1\0\2\10\1\0\2\10"
          + "\37\0\4\10\1\0\1\10\7\0\12\6\2\0\3\10"
          + "\20\0\7\10\1\0\1\10\1\0\3\10\1\0\26\10"
          + "\1\0\7\10\1\0\2\10\1\0\5\10\3\0\1\10"
          + "\22\0\1\10\17\0\1\10\5\0\12\6\25\0\10\10"
          + "\2\0\2\10\2\0\26\10\1\0\7\10\1\0\2\10"
          + "\2\0\4\10\3\0\1\10\36\0\2\10\1\0\3\10"
          + "\4\0\12\6\25\0\6\10\3\0\3\10\1\0\4\10"
          + "\3\0\2\10\1\0\1\10\1\0\2\10\3\0\2\10"
          + "\3\0\3\10\3\0\10\10\1\0\3\10\55\0\11\6"
          + "\25\0\10\10\1\0\3\10\1\0\27\10\1\0\12\10"
          + "\1\0\5\10\46\0\2\10\4\0\12\6\25\0\10\10"
          + "\1\0\3\10\1\0\27\10\1\0\12\10\1\0\5\10"
          + "\44\0\1\10\1\0\2\10\4\0\12\6\25\0\10\10"
          + "\1\0\3\10\1\0\27\10\1\0\20\10\46\0\2\10"
          + "\4\0\12\6\25\0\22\10\3\0\30\10\1\0\11\10"
          + "\1\0\1\10\2\0\7\10\71\0\1\12\60\10\1\12"
          + "\2\10\14\12\7\10\11\12\12\6\47\0\2\10\1\0"
          + "\1\10\2\0\2\10\1\0\1\10\2\0\1\10\6\0"
          + "\4\10\1\0\7\10\1\0\3\10\1\0\1\10\1\0"
          + "\1\10\2\0\2\10\1\0\4\10\1\0\2\10\11\0"
          + "\1\10\2\0\5\10\1\0\1\10\11\0\12\6\2\0"
          + "\2\10\42\0\1\10\37\0\12\6\26\0\10\10\1\0"
          + "\42\10\35\0\4\10\164\0\42\10\1\0\5\10\1\0"
          + "\2\10\25\0\12\6\6\0\6\10\112\0\46\10\12\0"
          + "\47\10\11\0\132\10\5\0\104\10\5\0\122\10\6\0"
          + "\7\10\1\0\77\10\1\0\1\10\1\0\4\10\2\0"
          + "\7\10\1\0\1\10\1\0\4\10\2\0\47\10\1\0"
          + "\1\10\1\0\4\10\2\0\37\10\1\0\1\10\1\0"
          + "\4\10\2\0\7\10\1\0\1\10\1\0\4\10\2\0"
          + "\7\10\1\0\7\10\1\0\27\10\1\0\37\10\1\0"
          + "\1\10\1\0\4\10\2\0\7\10\1\0\47\10\1\0"
          + "\23\10\16\0\11\6\56\0\125\10\14\0\u016c\10\2\0"
          + "\10\10\12\0\32\10\5\0\113\10\225\0\64\10\54\0"
          + "\12\6\46\0\12\6\6\0\130\10\10\0\51\10\127\0"
          + "\234\10\4\0\132\10\6\0\26\10\2\0\6\10\2\0"
          + "\46\10\2\0\6\10\2\0\10\10\1\0\1\10\1\0"
          + "\1\10\1\0\1\10\1\0\37\10\2\0\65\10\1\0"
          + "\7\10\1\0\1\10\3\0\3\10\1\0\7\10\3\0"
          + "\4\10\2\0\6\10\4\0\15\10\5\0\3\10\1\0"
          + "\7\10\202\0\1\10\202\0\1\10\4\0\1\10\2\0"
          + "\12\10\1\0\1\10\3\0\5\10\6\0\1\10\1\0"
          + "\1\10\1\0\1\10\1\0\4\10\1\0\3\10\1\0"
          + "\7\10\313\0\2\10\52\0\5\10\12\0\360\13\1\0"
          + "\136\10\21\0\30\10\70\0\220\13\200\0\u01c0\13\100\0"
          + "\u0100\13\215\10\163\0\244\10\134\0\u0100\13\7\10\14\0"
          + "\5\10\5\0\1\10\1\0\12\10\1\0\15\10\1\0"
          + "\5\10\1\0\1\10\1\0\2\10\1\0\2\10\1\0"
          + "\154\10\41\0\153\10\22\0\100\10\2\0\66\10\50\0"
          + "\14\10\164\0\3\10\1\0\1\10\1\0\207\10\23\0"
          + "\12\6\7\0\32\10\6\0\32\10\12\0\73\13\37\10"
          + "\3\0\6\10\2\0\6\10\2\0\6\10\2\0\3\10"
          + "\43\0";

  private static int[] zzUnpackcmap_blocks() {
    int[] result = new int[10496];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int[] result) {
    int i = 0; /* index in packed string  */
    int j = offset; /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value;
      while (--count > 0);
    }
    return j;
  }

  /** Translates DFA states to action switch labels. */
  private static final int[] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
      "\1\0\1\1\3\2\1\3\12\0\1\2\1\0\6\4"
          + "\3\5\1\0\1\6\1\7\2\4\2\0\3\5\1\6"
          + "\1\5\2\10\4\0\1\10\1\11\1\10\1\12\1\5";

  private static int[] zzUnpackAction() {
    int[] result = new int[50];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int[] result) {
    int i = 0; /* index in packed string  */
    int j = offset; /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value;
      while (--count > 0);
    }
    return j;
  }

  /** Translates a state to a row index in the transition table */
  private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
      "\0\0\0\14\0\30\0\44\0\60\0\14\0\74\0\110"
          + "\0\124\0\140\0\154\0\170\0\204\0\220\0\234\0\250"
          + "\0\264\0\300\0\314\0\330\0\344\0\360\0\374\0\u0108"
          + "\0\u0114\0\u0120\0\u012c\0\u0138\0\154\0\u0144\0\u0150\0\u015c"
          + "\0\u0168\0\u0174\0\u0180\0\u018c\0\u0198\0\u01a4\0\u01b0\0\124"
          + "\0\300\0\u01bc\0\u01c8\0\u01d4\0\u01e0\0\u01ec\0\u01f8\0\u0204"
          + "\0\u0210\0\u021c";

  private static int[] zzUnpackRowMap() {
    int[] result = new int[50];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int[] result) {
    int i = 0; /* index in packed string  */
    int j = offset; /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** The transition table of the DFA */
  private static final int[] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
      "\6\2\1\3\1\2\1\4\1\2\1\5\1\6\17\0"
          + "\1\7\1\10\1\11\1\3\1\12\1\3\1\10\1\5"
          + "\2\0\1\13\1\14\1\15\1\16\1\17\1\3\1\20"
          + "\1\21\1\16\1\5\4\0\1\15\1\16\1\22\1\5"
          + "\1\12\1\5\1\16\1\5\7\0\1\23\1\0\1\24"
          + "\1\0\1\25\7\0\1\26\1\0\1\27\1\0\1\30"
          + "\7\0\1\31\1\0\1\32\1\0\1\33\7\0\1\34"
          + "\1\0\1\34\1\0\1\34\11\0\1\35\13\0\1\36"
          + "\11\0\1\37\1\0\1\15\11\0\1\40\1\0\1\41"
          + "\1\0\1\42\7\0\1\43\1\0\1\44\1\0\1\45"
          + "\7\0\1\34\1\0\1\46\1\0\1\34\2\0\1\13"
          + "\1\14\1\15\1\16\1\22\1\3\1\20\1\21\1\16"
          + "\1\5\7\0\1\43\1\0\1\47\1\0\1\45\4\0"
          + "\3\7\1\23\1\0\1\23\1\7\1\25\4\0\3\15"
          + "\1\23\1\0\1\24\1\15\1\25\4\0\3\15\1\25"
          + "\1\0\1\25\1\15\1\25\4\0\1\7\2\10\1\26"
          + "\1\12\1\26\1\10\1\30\4\0\1\15\2\16\1\26"
          + "\1\12\1\27\1\16\1\30\4\0\1\15\2\16\1\30"
          + "\1\12\1\30\1\16\1\30\4\0\1\7\1\10\1\50"
          + "\1\31\1\12\1\31\1\10\1\33\4\0\1\15\1\16"
          + "\1\51\1\31\1\12\1\32\1\16\1\33\4\0\1\15"
          + "\1\16\1\51\1\33\1\12\1\33\1\16\1\33\5\0"
          + "\2\52\1\34\1\0\1\34\1\0\1\34\3\0\1\14"
          + "\5\0\1\36\6\0\3\53\1\37\1\0\1\37\1\53"
          + "\5\0\1\53\2\54\1\40\1\12\1\40\1\54\1\42"
          + "\5\0\2\55\1\40\1\12\1\41\1\55\1\42\5\0"
          + "\2\55\1\42\1\12\1\42\1\55\1\42\4\0\1\53"
          + "\1\54\1\56\1\43\1\12\1\43\1\54\1\45\5\0"
          + "\1\55\1\57\1\43\1\12\1\47\1\55\1\45\5\0"
          + "\1\55\1\60\1\45\1\12\1\45\1\55\1\45\5\0"
          + "\2\52\1\34\1\0\1\46\1\0\1\34\5\0\1\55"
          + "\1\60\1\43\1\12\1\47\1\55\1\45\7\0\1\61"
          + "\1\0\1\61\1\0\1\61\7\0\1\25\1\0\1\25"
          + "\1\0\1\25\7\0\1\30\1\0\1\30\1\0\1\30"
          + "\7\0\1\42\1\0\1\42\1\0\1\42\7\0\1\33"
          + "\1\0\1\33\1\0\1\33\7\0\1\45\1\0\1\62"
          + "\1\0\1\45\7\0\1\45\1\0\1\45\1\0\1\45"
          + "\5\0\2\52\1\61\1\0\1\61\1\0\1\61\5\0"
          + "\1\55\1\57\1\45\1\12\1\45\1\55\1\45\1\0";

  private static int[] zzUnpackTrans() {
    int[] result = new int[552];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int[] result) {
    int i = 0; /* index in packed string  */
    int j = offset; /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value;
      while (--count > 0);
    }
    return j;
  }

  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;

  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;

  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and {@link
   * #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /** ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState} */
  private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
      "\1\0\1\11\3\1\1\11\12\0\1\1\1\0\11\1" + "\1\0\4\1\2\0\7\1\4\0\5\1";

  private static int[] zzUnpackAttribute() {
    int[] result = new int[50];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int[] result) {
    int i = 0; /* index in packed string  */
    int j = offset; /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value;
      while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   *
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final {@link
   * #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */

  public static final int ALPHANUM = ClassicTokenizer.ALPHANUM;
  public static final int APOSTROPHE = ClassicTokenizer.APOSTROPHE;
  public static final int ACRONYM = ClassicTokenizer.ACRONYM;
  public static final int COMPANY = ClassicTokenizer.COMPANY;
  public static final int EMAIL = ClassicTokenizer.EMAIL;
  public static final int HOST = ClassicTokenizer.HOST;
  public static final int NUM = ClassicTokenizer.NUM;
  public static final int CJ = ClassicTokenizer.CJ;
  public static final int ACRONYM_DEP = ClassicTokenizer.ACRONYM_DEP;

  public static final String[] TOKEN_TYPES = ClassicTokenizer.TOKEN_TYPES;

  public final int yychar() {
    // jflex supports > 2GB docs but not lucene
    return (int) yychar;
  }

  /** Fills CharTermAttribute with the current token text. */
  public final void getText(CharTermAttribute t) {
    t.copyBuffer(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
  }

  public final void setBufferSize(int numChars) {
    throw new UnsupportedOperationException();
  }

  /**
   * Creates a new scanner
   *
   * @param in the java.io.Reader to read input from.
   */
  ClassicTokenizerImpl(java.io.Reader in) {
    this.zzReader = in;
  }

  /** Translates raw input code points to DFA table row */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input
        ? ZZ_CMAP_BLOCKS[offset]
        : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead, zzBuffer, 0, zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
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
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else { // There is room in the buffer for at least one more char
          int c = zzReader.read(); // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char) c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }

  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /** Resets the input position. */
  private final void yyResetPosition() {
    zzAtBOL = true;
    zzAtEOF = false;
    zzCurrentPos = 0;
    zzMarkedPos = 0;
    zzStartRead = 0;
    zzEndRead = 0;
    zzFinalHighSurrogate = 0;
    yyline = 0;
    yycolumn = 0;
    yychar = 0L;
  }

  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }

  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }

  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }

  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
  }

  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }

  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos - zzStartRead;
  }

  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that "Can't Possibly
   * Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }

  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number) {
    if (number > yylength()) zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }

  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int getNextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int[] zzTransL = ZZ_TRANS;
    int[] zzRowMapL = ZZ_ROWMAP;
    int[] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar += zzMarkedPosL - zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ((zzAttributes & 1) == 1) {
        zzAction = zzState;
      }

      zzForAction:
      {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          } else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          } else {
            // store back cached positions
            zzCurrentPos = zzCurrentPosL;
            zzMarkedPos = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL = zzCurrentPos;
            zzMarkedPosL = zzMarkedPos;
            zzBufferL = zzBuffer;
            zzEndReadL = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            } else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[zzRowMapL[zzState] + zzCMap(zzInput)];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ((zzAttributes & 1) == 1) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ((zzAttributes & 8) == 8) break zzForAction;
          }
        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      } else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            {
              /* Break so we don't hit fall-through warning: */
              break; /* ignore */
            }
            // fall through
          case 11:
            break;
          case 2:
            {
              return ALPHANUM;
            }
            // fall through
          case 12:
            break;
          case 3:
            {
              return CJ;
            }
            // fall through
          case 13:
            break;
          case 4:
            {
              return NUM;
            }
            // fall through
          case 14:
            break;
          case 5:
            {
              return HOST;
            }
            // fall through
          case 15:
            break;
          case 6:
            {
              return COMPANY;
            }
            // fall through
          case 16:
            break;
          case 7:
            {
              return APOSTROPHE;
            }
            // fall through
          case 17:
            break;
          case 8:
            {
              return ACRONYM_DEP;
            }
            // fall through
          case 18:
            break;
          case 9:
            {
              return ACRONYM;
            }
            // fall through
          case 19:
            break;
          case 10:
            {
              return EMAIL;
            }
            // fall through
          case 20:
            break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }
}
