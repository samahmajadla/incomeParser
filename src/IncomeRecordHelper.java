public class IncomeRecordHelper {

    public static IncomeRecord createRecord(int age, String education, String marriage, String occupation, String race, String sex, int hoursPerWeek, String country,  String income) {
        return new IncomeRecord(age, education(education), marriage(marriage), occupation(occupation), race(race),  sex(sex), hoursPerWeek, country(country),  above50(income));
    }

    public static boolean above50(String income){
        if (income.equals(">50K")) return true;
        else return false;
    }

    public static Education education(String edu){
        if (edu.equals("Bachelors"))        return Education.BACHELORS;
        else if (edu.equals("Some-college"))return Education.SOME_COLLEGE;
        else if (edu.equals("11th"))        return Education.ELEVENTH;
        else if (edu.equals("HS-grad"))     return Education.HS;
        else if (edu.equals("Prof-school")) return Education.PROF_SCHOOL;
        else if (edu.equals("Assoc-acdm"))  return Education.ASSOCACADEMY;
        else if (edu.equals("Assoc-voc"))   return Education.ASSOCVOCATIONAL;
        else if (edu.equals("9th"))         return Education.NINTH;
        else if (edu.equals("7th-8th"))     return Education.SEVENTH_EIGHTH;
        else if (edu.equals("12th"))        return Education.TWELFTH;
        else if (edu.equals("Masters"))     return Education.MASTERS;
        else if (edu.equals("1st-4th"))     return Education.FIRST_THRU_FOURTH;
        else if (edu.equals("10th"))        return Education.TENTH;
        else if (edu.equals("Doctorate"))   return Education.DOCTORATE;
        else if (edu.equals("5th-6th"))     return Education.FIFTH_SIXTH;
        else if (edu.equals("Preschool"))   return Education.PRESCHOOL;
        else return null;
    }

    public static MarriageStatus marriage(String marriage){
        if (marriage.equals("Married-civ-spouse"))        return MarriageStatus.MARRIED_CIV_SPOUSE;
        else if (marriage.equals("Divorced"))             return MarriageStatus.DIVORCED;
        else if (marriage.equals("Never-married"))        return MarriageStatus.NEVER_MARRIED;
        else if (marriage.equals("Separated"))            return MarriageStatus.SEPARATED;
        else if (marriage.equals("Widowed"))              return MarriageStatus.WIDOWED;
        else if (marriage.equals("Married-spouse-absent"))return MarriageStatus.MARRIED_SPOUSE_ABSENT;
        else if (marriage.equals("Married-AF-spouse"))    return MarriageStatus.MARRIED_AF_SPOUSE;
        else return null;
    }

    public static Occupation occupation(String occupation){
        if (occupation.equals("Tech-support"))          return Occupation.TECH_SUPPORT;
        else if (occupation.equals("Craft-repair"))     return Occupation.CRAFT_REPAIR;
        else if (occupation.equals("Other-service"))    return Occupation.OTHER_SERVICE;
        else if (occupation.equals("Sales"))            return Occupation.SALES;
        else if (occupation.equals("Exec-managerial"))  return Occupation.EXEC_MANAGERIAL;
        else if (occupation.equals("Prof-specialty"))   return Occupation.PROF_SPECIALTY;
        else if (occupation.equals("Handlers-cleaners"))return Occupation.HANDLERS_CLEANERS;
        else if (occupation.equals("Machine-op-inspct"))return Occupation.MACHINE_OP_INSPECT;
        else if (occupation.equals("Adm-clerical"))     return Occupation.ADMIN_CLINICAL;
        else if (occupation.equals("Farming-fishing"))  return Occupation.FARMING_FISHING;
        else if (occupation.equals("Transport-moving")) return Occupation.TRANSPOR_MOVING;
        else if (occupation.equals("Priv-house-serv"))  return Occupation.PRIV_HOUSE_SERV;
        else if (occupation.equals("Protective-serv"))  return Occupation.PROTECT_SERVICE;
        else if (occupation.equals("Armed-Forces"))     return Occupation.ARMOURED_SERVICE;
        else return null;
    }

    public static Race race(String race){
        if (race.equals("White"))                   return Race.WHITE;
        else if (race.equals("Asian-Pac-Islander")) return Race.ASIAN_ISLANDER;
        else if (race.equals("Amer-Indian-Eskimo")) return Race.AMERICAN_INDIAN_ESKIMO;
        else if (race.equals("Other"))              return Race.OTHER;
        else if (race.equals("Black"))              return Race.BLACK;
        else return null;
    }

    public static Sex sex(String sex){
        if (sex.equals("Male"))      return Sex.MALE;
        else if (sex.equals("Female")) return Sex.FEMALE;
        else return null;
    }

    public static NativeCountry country(String country){
        if (country.equals("United-States"))                      return NativeCountry.US;
        else if (country.equals("Cambodia"))                      return NativeCountry.CAMBODIA;
        else if (country.equals("England"))                       return NativeCountry.ENGLAND;
        else if (country.equals("Puerto-Rico"))                   return NativeCountry.PUERTO_RICO;
        else if (country.equals("Canada"))                        return NativeCountry.CANADA;
        else if (country.equals("Germany"))                       return NativeCountry.GERMANY;
        else if (country.equals("Outlying-US(Guam-USVI-etc)"))    return NativeCountry.OUTLYING_US;
        else if (country.equals("India"))                         return NativeCountry.INDIA;
        else if (country.equals("Japan"))                         return NativeCountry.JAPAN;
        else if (country.equals("Greece"))                        return NativeCountry.GREECE;
        else if (country.equals("South"))                         return NativeCountry.SOUTH;
        else if (country.equals("China"))                         return NativeCountry.CHINA;
        else if (country.equals("Cuba"))                          return NativeCountry.CUBA;
        else if (country.equals("Iran"))                          return NativeCountry.IRAN;
        else if (country.equals("Honduras"))                      return NativeCountry.HONDURAS;
        else if (country.equals("Philippines"))                   return NativeCountry.PHILLIPINES;
        else if (country.equals("Italy"))                         return NativeCountry.ITALY;
        else if (country.equals("Poland"))                        return NativeCountry.POLAND;
        else if (country.equals("Jamaica"))                       return NativeCountry.JAMAICA;
        else if (country.equals("Vietnam"))                       return NativeCountry.VIETNAM;
        else if (country.equals("Mexico"))                        return NativeCountry.MEXICO;
        else if (country.equals("Portugal"))                      return NativeCountry.PORTUGAL;
        else if (country.equals("Ireland"))                       return NativeCountry.IRELAND;
        else if (country.equals("France"))                        return NativeCountry.FRANCE;
        else if (country.equals("Dominican-Republic"))            return NativeCountry.DR;
        else if (country.equals("Laos"))                          return NativeCountry.LAOS;
        else if (country.equals("Ecuador"))                       return NativeCountry.ECUADOR;
        else if (country.equals("Taiwan"))                        return NativeCountry.TAIWAN;
        else if (country.equals("Haiti"))                         return NativeCountry.HAITI;
        else if (country.equals("Columbia"))                      return NativeCountry.COLUMBIA;
        else if (country.equals("Hungary"))                       return NativeCountry.HUNGARY;
        else if (country.equals("Guatemala"))                     return NativeCountry.GUATAMALLA;
        else if (country.equals("Nicaragua"))                     return NativeCountry.NICARAGUA;
        else if (country.equals("Scotland"))                      return NativeCountry.SCOTLAND;
        else if (country.equals("Thailand"))                      return NativeCountry.THAILAND;
        else if (country.equals("Yugoslavia"))                    return NativeCountry.YUGOSLAVIA;
        else if (country.equals("El-Salvador"))                   return NativeCountry.EL_SALVADOR;
        else if (country.equals("Trinidad&Tobago"))               return NativeCountry.TRINIDAD;
        else if (country.equals("Peru"))                          return NativeCountry.PERU;
        else if (country.equals("Hong"))                          return NativeCountry.HK;
        else if (country.equals("Holand-Netherlands"))            return NativeCountry.HOLLAND;
        else return null;
    }
}
