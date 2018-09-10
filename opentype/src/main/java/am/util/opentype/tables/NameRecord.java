package am.util.opentype.tables;

/**
 * 命名记录
 */
public class NameRecord {

    public static final int PLATFORM_UNICODE = 0;
    public static final int PLATFORM_MACINTOSH = 1;
    // Platform ID 2 (ISO) has been deprecated as of OpenType version v1.3.
    // It was intended to represent ISO/IEC 10646, as opposed to Unicode.
    // It is redundant, however, since both standards have identical character code assignments.
    @Deprecated
    public static final int PLATFORM_ISO = 2;
    public static final int PLATFORM_WINDOWS = 3;
    public static final int PLATFORM_CUSTOM = 4;

    // Platform-specific encoding and language IDs: Unicode platform (platform ID = 0)
    public static final int ENCODING_UNICODE_0 = 0;// Unicode 1.0 semantics
    public static final int ENCODING_UNICODE_1 = 1;// Unicode 1.1 semantics
    public static final int ENCODING_UNICODE_2 = 2;// ISO/IEC 10646 semantics
    public static final int ENCODING_UNICODE_3 = 3;// Unicode 2.0 and onwards semantics, Unicode BMP only ('cmap' subtable formats 0, 4, 6).
    public static final int ENCODING_UNICODE_4 = 4;// Unicode 2.0 and onwards semantics, Unicode full repertoire ('cmap' subtable formats 0, 4, 6, 10, 12).
    public static final int ENCODING_UNICODE_5 = 5;// Unicode Variation Sequences ('cmap' subtable format 14).
    public static final int ENCODING_UNICODE_6 = 6;// Unicode full repertoire ('cmap' subtable formats 0, 4, 6, 10, 12, 13).

    // Platform-specific encoding and language IDs: Windows platform (platform ID= 3)
    public static final int ENCODING_WINDOWS_0 = 0;// Symbol
    public static final int ENCODING_WINDOWS_1 = 1;// Unicode BMP
    public static final int ENCODING_WINDOWS_2 = 2;// ShiftJIS
    public static final int ENCODING_WINDOWS_3 = 3;// PRC
    public static final int ENCODING_WINDOWS_4 = 4;// Big5
    public static final int ENCODING_WINDOWS_5 = 5;// Wansung
    public static final int ENCODING_WINDOWS_6 = 6;// Johab
    public static final int ENCODING_WINDOWS_7 = 7;// Reserved
    public static final int ENCODING_WINDOWS_8 = 8;// Reserved
    public static final int ENCODING_WINDOWS_9 = 9;// Reserved
    public static final int ENCODING_WINDOWS_10 = 10;// Unicode full repertoire

    public static final int LANGUAGE_WINDOWS_0436 = 0x0436;// Afrikaans South Africa
    public static final int LANGUAGE_WINDOWS_041C = 0x041C;// Albanian Albania
    public static final int LANGUAGE_WINDOWS_0484 = 0x0484;// Alsatian France
    public static final int LANGUAGE_WINDOWS_045E = 0x045E;// Amharic Ethiopia
    public static final int LANGUAGE_WINDOWS_1401 = 0x1401;// Arabic Algeria
    public static final int LANGUAGE_WINDOWS_3C01 = 0x3C01;// Arabic Bahrain
    public static final int LANGUAGE_WINDOWS_0C01 = 0x0C01;// Arabic Egypt
    public static final int LANGUAGE_WINDOWS_0801 = 0x0801;// Arabic Iraq
    public static final int LANGUAGE_WINDOWS_2C01 = 0x2C01;// Arabic Jordan
    public static final int LANGUAGE_WINDOWS_3401 = 0x3401;// Arabic Kuwait
    public static final int LANGUAGE_WINDOWS_3001 = 0x3001;// Arabic Lebanon
    public static final int LANGUAGE_WINDOWS_1001 = 0x1001;// Arabic Libya
    public static final int LANGUAGE_WINDOWS_1801 = 0x1801;// Arabic Morocco
    public static final int LANGUAGE_WINDOWS_2001 = 0x2001;// Arabic Oman
    public static final int LANGUAGE_WINDOWS_4001 = 0x4001;// Arabic Qatar
    public static final int LANGUAGE_WINDOWS_0401 = 0x0401;// Arabic Saudi Arabia
    public static final int LANGUAGE_WINDOWS_2801 = 0x2801;// Arabic Syria
    public static final int LANGUAGE_WINDOWS_1C01 = 0x1C01;// Arabic Tunisia
    public static final int LANGUAGE_WINDOWS_3801 = 0x3801;// Arabic U.A.E.
    public static final int LANGUAGE_WINDOWS_2401 = 0x2401;// Arabic Yemen
    public static final int LANGUAGE_WINDOWS_042B = 0x042B;// Armenian Armenia
    public static final int LANGUAGE_WINDOWS_044D = 0x044D;// Assamese India
    public static final int LANGUAGE_WINDOWS_082C = 0x082C;// Azeri (Cyrillic) Azerbaijan
    public static final int LANGUAGE_WINDOWS_042C = 0x042C;// Azeri (Latin) Azerbaijan
    public static final int LANGUAGE_WINDOWS_046D = 0x046D;// Bashkir Russia
    public static final int LANGUAGE_WINDOWS_042D = 0x042D;// Basque Basque
    public static final int LANGUAGE_WINDOWS_0423 = 0x0423;// Belarusian Belarus
    public static final int LANGUAGE_WINDOWS_0845 = 0x0845;// Bengali Bangladesh
    public static final int LANGUAGE_WINDOWS_0445 = 0x0445;// Bengali India
    public static final int LANGUAGE_WINDOWS_201A = 0x201A;// Bosnian (Cyrillic) Bosnia and Herzegovina
    public static final int LANGUAGE_WINDOWS_141A = 0x141A;// Bosnian (Latin) Bosnia and Herzegovina
    public static final int LANGUAGE_WINDOWS_047E = 0x047E;// Breton France
    public static final int LANGUAGE_WINDOWS_0402 = 0x0402;// Bulgarian Bulgaria
    public static final int LANGUAGE_WINDOWS_0403 = 0x0403;// Catalan Catalan
    public static final int LANGUAGE_WINDOWS_0C04 = 0x0C04;// Chinese Hong Kong S.A.R.
    public static final int LANGUAGE_WINDOWS_1404 = 0x1404;// Chinese Macao S.A.R.
    public static final int LANGUAGE_WINDOWS_0804 = 0x0804;// Chinese People’s Republic of China
    public static final int LANGUAGE_WINDOWS_1004 = 0x1004;// Chinese Singapore
    public static final int LANGUAGE_WINDOWS_0404 = 0x0404;// Chinese Taiwan
    public static final int LANGUAGE_WINDOWS_0483 = 0x0483;// Corsican France
    public static final int LANGUAGE_WINDOWS_041A = 0x041A;// Croatian Croatia
    public static final int LANGUAGE_WINDOWS_101A = 0x101A;// Croatian (Latin) Bosnia and Herzegovina
    public static final int LANGUAGE_WINDOWS_0405 = 0x0405;// Czech Czech Republic
    public static final int LANGUAGE_WINDOWS_0406 = 0x0406;// Danish Denmark
    public static final int LANGUAGE_WINDOWS_048C = 0x048C;// Dari Afghanistan
    public static final int LANGUAGE_WINDOWS_0465 = 0x0465;// Divehi Maldives
    public static final int LANGUAGE_WINDOWS_0813 = 0x0813;// Dutch Belgium
    public static final int LANGUAGE_WINDOWS_0413 = 0x0413;// Dutch Netherlands
    public static final int LANGUAGE_WINDOWS_0C09 = 0x0C09;// English Australia
    public static final int LANGUAGE_WINDOWS_2809 = 0x2809;// English Belize
    public static final int LANGUAGE_WINDOWS_1009 = 0x1009;// English Canada
    public static final int LANGUAGE_WINDOWS_2409 = 0x2409;// English Caribbean
    public static final int LANGUAGE_WINDOWS_4009 = 0x4009;// English India
    public static final int LANGUAGE_WINDOWS_1809 = 0x1809;// English Ireland
    public static final int LANGUAGE_WINDOWS_2009 = 0x2009;// English Jamaica
    public static final int LANGUAGE_WINDOWS_4409 = 0x4409;// English Malaysia
    public static final int LANGUAGE_WINDOWS_1409 = 0x1409;// English New Zealand
    public static final int LANGUAGE_WINDOWS_3409 = 0x3409;// English Republic of the Philippines
    public static final int LANGUAGE_WINDOWS_4809 = 0x4809;// English Singapore
    public static final int LANGUAGE_WINDOWS_1C09 = 0x1C09;// English South Africa
    public static final int LANGUAGE_WINDOWS_2C09 = 0x2C09;// English Trinidad and Tobago
    public static final int LANGUAGE_WINDOWS_0809 = 0x0809;// English United Kingdom
    public static final int LANGUAGE_WINDOWS_0409 = 0x0409;// English United States
    public static final int LANGUAGE_WINDOWS_3009 = 0x3009;// English Zimbabwe
    public static final int LANGUAGE_WINDOWS_0425 = 0x0425;// Estonian Estonia
    public static final int LANGUAGE_WINDOWS_0438 = 0x0438;// Faroese Faroe Islands
    public static final int LANGUAGE_WINDOWS_0464 = 0x0464;// Filipino Philippines
    public static final int LANGUAGE_WINDOWS_040B = 0x040B;// Finnish Finland
    public static final int LANGUAGE_WINDOWS_080C = 0x080C;// French Belgium
    public static final int LANGUAGE_WINDOWS_0C0C = 0x0C0C;// French Canada
    public static final int LANGUAGE_WINDOWS_040C = 0x040C;// French France
    public static final int LANGUAGE_WINDOWS_140C = 0x140C;// French Luxembourg
    public static final int LANGUAGE_WINDOWS_180C = 0x180C;// French Principality of Monaco
    public static final int LANGUAGE_WINDOWS_100C = 0x100C;// French Switzerland
    public static final int LANGUAGE_WINDOWS_0462 = 0x0462;// Frisian Netherlands
    public static final int LANGUAGE_WINDOWS_0456 = 0x0456;// Galician Galician
    public static final int LANGUAGE_WINDOWS_0437 = 0x0437;// Georgian Georgia
    public static final int LANGUAGE_WINDOWS_0C07 = 0x0C07;// German Austria
    public static final int LANGUAGE_WINDOWS_0407 = 0x0407;// German Germany
    public static final int LANGUAGE_WINDOWS_1407 = 0x1407;// German Liechtenstein
    public static final int LANGUAGE_WINDOWS_1007 = 0x1007;// German Luxembourg
    public static final int LANGUAGE_WINDOWS_0807 = 0x0807;// German Switzerland
    public static final int LANGUAGE_WINDOWS_0408 = 0x0408;// Greek Greece
    public static final int LANGUAGE_WINDOWS_046F = 0x046F;// Greenlandic Greenland
    public static final int LANGUAGE_WINDOWS_0447 = 0x0447;// Gujarati India
    public static final int LANGUAGE_WINDOWS_0468 = 0x0468;// Hausa (Latin) Nigeria
    public static final int LANGUAGE_WINDOWS_040D = 0x040D;// Hebrew Israel
    public static final int LANGUAGE_WINDOWS_0439 = 0x0439;// Hindi India
    public static final int LANGUAGE_WINDOWS_040E = 0x040E;// Hungarian Hungary
    public static final int LANGUAGE_WINDOWS_040F = 0x040F;// Icelandic Iceland
    public static final int LANGUAGE_WINDOWS_0470 = 0x0470;// Igbo Nigeria
    public static final int LANGUAGE_WINDOWS_0421 = 0x0421;// Indonesian Indonesia
    public static final int LANGUAGE_WINDOWS_045D = 0x045D;// Inuktitut Canada
    public static final int LANGUAGE_WINDOWS_085D = 0x085D;// Inuktitut (Latin) Canada
    public static final int LANGUAGE_WINDOWS_083C = 0x083C;// Irish Ireland
    public static final int LANGUAGE_WINDOWS_0434 = 0x0434;// isiXhosa South Africa
    public static final int LANGUAGE_WINDOWS_0435 = 0x0435;// isiZulu South Africa
    public static final int LANGUAGE_WINDOWS_0410 = 0x0410;// Italian Italy
    public static final int LANGUAGE_WINDOWS_0810 = 0x0810;// Italian Switzerland
    public static final int LANGUAGE_WINDOWS_0411 = 0x0411;// Japanese Japan
    public static final int LANGUAGE_WINDOWS_044B = 0x044B;// Kannada India
    public static final int LANGUAGE_WINDOWS_043F = 0x043F;// Kazakh Kazakhstan
    public static final int LANGUAGE_WINDOWS_0453 = 0x0453;// Khmer Cambodia
    public static final int LANGUAGE_WINDOWS_0486 = 0x0486;// K'iche Guatemala
    public static final int LANGUAGE_WINDOWS_0487 = 0x0487;// Kinyarwanda Rwanda
    public static final int LANGUAGE_WINDOWS_0441 = 0x0441;// Kiswahili Kenya
    public static final int LANGUAGE_WINDOWS_0457 = 0x0457;// Konkani India
    public static final int LANGUAGE_WINDOWS_0412 = 0x0412;// Korean Korea
    public static final int LANGUAGE_WINDOWS_0440 = 0x0440;// Kyrgyz Kyrgyzstan
    public static final int LANGUAGE_WINDOWS_0454 = 0x0454;// Lao Lao P.D.R.
    public static final int LANGUAGE_WINDOWS_0426 = 0x0426;// Latvian Latvia
    public static final int LANGUAGE_WINDOWS_0427 = 0x0427;// Lithuanian Lithuania
    public static final int LANGUAGE_WINDOWS_082E = 0x082E;// Lower Sorbian Germany
    public static final int LANGUAGE_WINDOWS_046E = 0x046E;// Luxembourgish Luxembourg
    public static final int LANGUAGE_WINDOWS_042F = 0x042F;// Macedonian (FYROM) Former Yugoslav Republic of Macedonia
    public static final int LANGUAGE_WINDOWS_083E = 0x083E;// Malay Brunei Darussalam
    public static final int LANGUAGE_WINDOWS_043E = 0x043E;// Malay Malaysia
    public static final int LANGUAGE_WINDOWS_044C = 0x044C;// Malayalam India
    public static final int LANGUAGE_WINDOWS_043A = 0x043A;// Maltese Malta
    public static final int LANGUAGE_WINDOWS_0481 = 0x0481;// Maori New Zealand
    public static final int LANGUAGE_WINDOWS_047A = 0x047A;// Mapudungun Chile
    public static final int LANGUAGE_WINDOWS_044E = 0x044E;// Marathi India
    public static final int LANGUAGE_WINDOWS_047C = 0x047C;// Mohawk Mohawk
    public static final int LANGUAGE_WINDOWS_0450 = 0x0450;// Mongolian (Cyrillic) Mongolia
    public static final int LANGUAGE_WINDOWS_0850 = 0x0850;// Mongolian (Traditional) People’s Republic of China
    public static final int LANGUAGE_WINDOWS_0461 = 0x0461;// Nepali Nepal
    public static final int LANGUAGE_WINDOWS_0414 = 0x0414;// Norwegian (Bokmal) Norway
    public static final int LANGUAGE_WINDOWS_0814 = 0x0814;// Norwegian (Nynorsk) Norway
    public static final int LANGUAGE_WINDOWS_0482 = 0x0482;// Occitan France
    public static final int LANGUAGE_WINDOWS_0448 = 0x0448;// Odia (formerly Oriya) India
    public static final int LANGUAGE_WINDOWS_0463 = 0x0463;// Pashto Afghanistan
    public static final int LANGUAGE_WINDOWS_0415 = 0x0415;// Polish Poland
    public static final int LANGUAGE_WINDOWS_0416 = 0x0416;// Portuguese Brazil
    public static final int LANGUAGE_WINDOWS_0816 = 0x0816;// Portuguese Portugal
    public static final int LANGUAGE_WINDOWS_0446 = 0x0446;// Punjabi India
    public static final int LANGUAGE_WINDOWS_046B = 0x046B;// Quechua Bolivia
    public static final int LANGUAGE_WINDOWS_086B = 0x086B;// Quechua Ecuador
    public static final int LANGUAGE_WINDOWS_0C6B = 0x0C6B;// Quechua Peru
    public static final int LANGUAGE_WINDOWS_0418 = 0x0418;// Romanian Romania
    public static final int LANGUAGE_WINDOWS_0417 = 0x0417;// Romansh Switzerland
    public static final int LANGUAGE_WINDOWS_0419 = 0x0419;// Russian Russia
    public static final int LANGUAGE_WINDOWS_243B = 0x243B;// Sami (Inari) Finland
    public static final int LANGUAGE_WINDOWS_103B = 0x103B;// Sami (Lule) Norway
    public static final int LANGUAGE_WINDOWS_143B = 0x143B;// Sami (Lule) Sweden
    public static final int LANGUAGE_WINDOWS_0C3B = 0x0C3B;// Sami (Northern) Finland
    public static final int LANGUAGE_WINDOWS_043B = 0x043B;// Sami (Northern) Norway
    public static final int LANGUAGE_WINDOWS_083B = 0x083B;// Sami (Northern) Sweden
    public static final int LANGUAGE_WINDOWS_203B = 0x203B;// Sami (Skolt) Finland
    public static final int LANGUAGE_WINDOWS_183B = 0x183B;// Sami (Southern) Norway
    public static final int LANGUAGE_WINDOWS_1C3B = 0x1C3B;// Sami (Southern) Sweden
    public static final int LANGUAGE_WINDOWS_044F = 0x044F;// Sanskrit India
    public static final int LANGUAGE_WINDOWS_1C1A = 0x1C1A;// Serbian (Cyrillic) Bosnia and Herzegovina
    public static final int LANGUAGE_WINDOWS_0C1A = 0x0C1A;// Serbian (Cyrillic) Serbia
    public static final int LANGUAGE_WINDOWS_181A = 0x181A;// Serbian (Latin) Bosnia and Herzegovina
    public static final int LANGUAGE_WINDOWS_081A = 0x081A;// Serbian (Latin) Serbia
    public static final int LANGUAGE_WINDOWS_046C = 0x046C;// Sesotho sa Leboa South Africa
    public static final int LANGUAGE_WINDOWS_0432 = 0x0432;// Setswana South Africa
    public static final int LANGUAGE_WINDOWS_045B = 0x045B;// Sinhala Sri Lanka
    public static final int LANGUAGE_WINDOWS_041B = 0x041B;// Slovak Slovakia
    public static final int LANGUAGE_WINDOWS_0424 = 0x0424;// Slovenian Slovenia
    public static final int LANGUAGE_WINDOWS_2C0A = 0x2C0A;// Spanish Argentina
    public static final int LANGUAGE_WINDOWS_400A = 0x400A;// Spanish Bolivia
    public static final int LANGUAGE_WINDOWS_340A = 0x340A;// Spanish Chile
    public static final int LANGUAGE_WINDOWS_240A = 0x240A;// Spanish Colombia
    public static final int LANGUAGE_WINDOWS_140A = 0x140A;// Spanish Costa Rica
    public static final int LANGUAGE_WINDOWS_1C0A = 0x1C0A;// Spanish Dominican Republic
    public static final int LANGUAGE_WINDOWS_300A = 0x300A;// Spanish Ecuador
    public static final int LANGUAGE_WINDOWS_440A = 0x440A;// Spanish El Salvador
    public static final int LANGUAGE_WINDOWS_100A = 0x100A;// Spanish Guatemala
    public static final int LANGUAGE_WINDOWS_480A = 0x480A;// Spanish Honduras
    public static final int LANGUAGE_WINDOWS_080A = 0x080A;// Spanish Mexico
    public static final int LANGUAGE_WINDOWS_4C0A = 0x4C0A;// Spanish Nicaragua
    public static final int LANGUAGE_WINDOWS_180A = 0x180A;// Spanish Panama
    public static final int LANGUAGE_WINDOWS_3C0A = 0x3C0A;// Spanish Paraguay
    public static final int LANGUAGE_WINDOWS_280A = 0x280A;// Spanish Peru
    public static final int LANGUAGE_WINDOWS_500A = 0x500A;// Spanish Puerto Rico
    public static final int LANGUAGE_WINDOWS_0C0A = 0x0C0A;// Spanish (Modern Sort) Spain
    public static final int LANGUAGE_WINDOWS_040A = 0x040A;// Spanish (Traditional Sort) Spain
    public static final int LANGUAGE_WINDOWS_540A = 0x540A;// Spanish United States
    public static final int LANGUAGE_WINDOWS_380A = 0x380A;// Spanish Uruguay
    public static final int LANGUAGE_WINDOWS_200A = 0x200A;// Spanish Venezuela
    public static final int LANGUAGE_WINDOWS_081D = 0x081D;// Sweden Finland
    public static final int LANGUAGE_WINDOWS_041D = 0x041D;// Swedish Sweden
    public static final int LANGUAGE_WINDOWS_045A = 0x045A;// Syriac Syria
    public static final int LANGUAGE_WINDOWS_0428 = 0x0428;// Tajik (Cyrillic) Tajikistan
    public static final int LANGUAGE_WINDOWS_085F = 0x085F;// Tamazight (Latin) Algeria
    public static final int LANGUAGE_WINDOWS_0449 = 0x0449;// Tamil India
    public static final int LANGUAGE_WINDOWS_0444 = 0x0444;// Tatar Russia
    public static final int LANGUAGE_WINDOWS_044A = 0x044A;// Telugu India
    public static final int LANGUAGE_WINDOWS_041E = 0x041E;// Thai Thailand
    public static final int LANGUAGE_WINDOWS_0451 = 0x0451;// Tibetan PRC
    public static final int LANGUAGE_WINDOWS_041F = 0x041F;// Turkish Turkey
    public static final int LANGUAGE_WINDOWS_0442 = 0x0442;// Turkmen Turkmenistan
    public static final int LANGUAGE_WINDOWS_0480 = 0x0480;// Uighur PRC
    public static final int LANGUAGE_WINDOWS_0422 = 0x0422;// Ukrainian Ukraine
    public static final int LANGUAGE_WINDOWS_042E = 0x042E;// Upper Sorbian Germany
    public static final int LANGUAGE_WINDOWS_0420 = 0x0420;// Urdu Islamic Republic of Pakistan
    public static final int LANGUAGE_WINDOWS_0843 = 0x0843;// Uzbek (Cyrillic) Uzbekistan
    public static final int LANGUAGE_WINDOWS_0443 = 0x0443;// Uzbek (Latin) Uzbekistan
    public static final int LANGUAGE_WINDOWS_042A = 0x042A;// Vietnamese Vietnam
    public static final int LANGUAGE_WINDOWS_0452 = 0x0452;// Welsh United Kingdom
    public static final int LANGUAGE_WINDOWS_0488 = 0x0488;// Wolof Senegal
    public static final int LANGUAGE_WINDOWS_0485 = 0x0485;// Yakut Russia
    public static final int LANGUAGE_WINDOWS_0478 = 0x0478;// Yi PRC
    public static final int LANGUAGE_WINDOWS_046A = 0x046A;// Yoruba Nigeria


    private final int mPlatformID;// Platform ID. Platform ID values 240 through 255 are reserved for user-defined platforms. This specification will never assign these values to a registered platform.
    private final int mEncodingID;// Platform-specific encoding ID.
    private final int mLanguageID;// Language ID.
    private final int mNameID;// Name ID.
    private final int mLength;// String length (in bytes).
    private final int mOffset;// String offset from start of storage area (in bytes).

    public NameRecord(int platformID, int encodingID, int languageID, int nameID,
                      int length, int offset) {
        mPlatformID = platformID;
        mEncodingID = encodingID;
        mLanguageID = languageID;
        mNameID = nameID;
        mLength = length;
        mOffset = offset;
    }
}