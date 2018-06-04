import org.junit.Test;

import java.security.spec.ECField;

import static org.junit.Assert.*;

public class IncomeRecordHelperTest {

    @Test
    public void helperCanCreateIncomeRecord() {
        IncomeRecord record = IncomeRecordHelper.createRecord(23, "HS-grad", "Never-married", "Other-service", "Other",  "Female", 40,"United-States",">50K");
        assertEquals(23, record.getAge());
        assertEquals(Education.HS, record.getEducation());
        assertEquals(MarriageStatus.NEVER_MARRIED, record.getMarried());
        assertEquals(Occupation.OTHER_SERVICE, record.getOccupation());
        assertEquals(Race.OTHER, record.getRace());
        assertEquals(40, record.getHoursPerWeek());
        assertEquals(NativeCountry.US, record.getCountry());
        assertEquals(Sex.FEMALE, record.getSex());
        assertTrue(record.isAbove50());
    }

    @Test
    public void educationConversion(){
        Education[] values = Education.values();
        String[] strings = {"Bachelors", "Some-college","11th","HS-grad","Prof-school", "Assoc-acdm", "Assoc-voc", "9th", "7th-8th", "12th", "Masters", "1st-4th", "10th", "Doctorate", "5th-6th", "Preschool" };
        for (int i = 0; i < strings.length; i++){
            assertEquals(values[i], IncomeRecordHelper.education(strings[i]));
        }
    }

    @Test
    public void marriageConversion(){
        MarriageStatus[] values = MarriageStatus.values();
        String[] strings = {"Married-civ-spouse","Divorced", "Never-married", "Separated", "Widowed", "Married-spouse-absent", "Married-AF-spouse"};
        for (int i = 0; i < strings.length; i++){
            assertEquals(values[i], IncomeRecordHelper.marriage(strings[i]));
        }
    }

    @Test
    public void occupationConversion(){
        Occupation[] values = Occupation.values();
        String[] strings = {"Tech-support","Craft-repair","Other-service","Sales","Exec-managerial","Prof-specialty","Handlers-cleaners","Machine-op-inspct","Adm-clerical","Farming-fishing","Transport-moving","Priv-house-serv","Protective-serv","Armed-Forces"  };
        for (int i = 0; i < strings.length; i++){
            assertEquals(values[i], IncomeRecordHelper.occupation(strings[i]));
        }
    }

    @Test
    public void raceConversion(){
        Race[] values = Race.values();
        String[] strings = {"White","Asian-Pac-Islander","Amer-Indian-Eskimo","Other","Black" };
        for (int i = 0; i < strings.length; i++){
            assertEquals(values[i], IncomeRecordHelper.race(strings[i]));
        }
    }

    @Test
    public void sexConversion(){
        Sex[] values = Sex.values();
        String[] strings = {"Male","Female"};
        for (int i = 0; i < strings.length; i++){
            assertEquals(values[i], IncomeRecordHelper.sex(strings[i]));
        }
    }

    @Test
    public void nativeCountryConversion(){
        NativeCountry[] values = NativeCountry.values();
        String[] strings = {"United-States","Cambodia","England","Puerto-Rico","Canada","Germany","Outlying-US(Guam-USVI-etc)","India","Japan","Greece","South","China","Cuba","Iran","Honduras","Philippines","Italy","Poland","Jamaica","Vietnam","Mexico","Portugal","Ireland","France","Dominican-Republic","Laos","Ecuador","Taiwan","Haiti","Columbia","Hungary","Guatemala","Nicaragua","Scotland","Thailand","Yugoslavia","El-Salvador","Trinidad&Tobago","Peru","Hong","Holand-Netherlands"};
        for (int i = 0; i < strings.length; i++){
            assertEquals(values[i], IncomeRecordHelper.country(strings[i]));
        }
    }


}