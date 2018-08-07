package br.com.i9access.pdfextract;

/**
 *
 * @author i9desenv
 */
public class BodyCompositionDO {

    private String name;
    private String age;
    private String gender;
    private String height;
    private String dateTime;
    private String analyzer;

    private String weight;
    private String bodyMassIndex;
    private String bodyFat;
    private String bodyFatMass;

    private String bodyFatRange;
    private String fatFreeMass;
    private String visceralFatRating;
    private String bodyWater;
    private String bodyWaterMass;
    private String muscleMass;
    private String boneMass;
    private String basalMetabolicRate;
    private String metabolicAge;
    private String dailyCalorieIntake;
    private String physiqueRating;

    public String leftLegFat;
    public String rightLegFat;
    public String leftArmFat;
    public String rightArmFat;
    public String trunkFat;

    public String leftLegMuscleMass;
    public String rightLegMuscleMass;
    public String leftArmMuscleMass;
    public String rightArmMuscleMass;
    public String trunkMuscleMass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getAgeInteger() {
        if (age != null) {
            return Integer.parseInt(age);
        } else {
            return null;
        }
    }

    public void setAge(Integer age) {
        this.age = age.toString();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Float getHeightFloat() {
        if (height != null) {
            height = height.replace(",", ".");
            height = height.replace("cm", "");
            return Float.parseFloat(height);
        } else {
            return null;
        }
    }

    public void setHeight(Float height) {
        this.height = height.toString();
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getAnalyzer() {
        return analyzer;
    }

    public void setAnalyzer(String analyzer) {
        this.analyzer = analyzer;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Float getWeightFloat() {
        if (weight != null) {
            weight = weight.replace(",", ".");
            weight = weight.replace("kg", "");
            return Float.parseFloat(weight);
        } else {
            return null;
        }
    }

    public void setWeight(Float weight) {
        this.weight = weight.toString();
    }

    public String getBodyMassIndex() {
        return bodyMassIndex;
    }

    public void setBodyMassIndex(String bodyMassIndex) {
        this.bodyMassIndex = bodyMassIndex;
    }

    public Float getBodyMassIndexFloat() {
        if (bodyMassIndex != null) {
            bodyMassIndex = bodyMassIndex.replace(",", ".");
            return Float.parseFloat(bodyMassIndex);
        } else {
            return null;
        }
    }

    public void setBodyMassIndex(Float bodyMassIndex) {
        this.bodyMassIndex = bodyMassIndex.toString();
    }

    public String getBodyFat() {
        return bodyFat;
    }

    public void setBodyFat(String bodyFat) {
        this.bodyFat = bodyFat;
    }

    public Float getBodyFatFloat() {
        if (bodyFat != null) {
            bodyFat = bodyFat.replace(",", ".");
            bodyFat = bodyFat.replace("%", "");
            return Float.parseFloat(bodyFat);
        } else {
            return null;
        }
    }

    public void setBodyFat(Float bodyFat) {
        this.bodyFat = bodyFat.toString();
    }

    public String getBodyFatMass() {
        return bodyFatMass;
    }

    public void setBodyFatMass(String bodyFatMass) {
        this.bodyFatMass = bodyFatMass;
    }

    public Float getBodyFatMassFloat() {
        if (bodyFatMass != null) {
            bodyFatMass = bodyFatMass.replace(",", ".");
            bodyFatMass = bodyFatMass.replace("kg", "");
            return Float.parseFloat(bodyFatMass);
        } else {
            return null;
        }
    }

    public void setBodyFatMass(Float bodyFatMass) {
        this.bodyFatMass = bodyFatMass.toString();
    }

    public String getBodyFatRange() {
        return bodyFatRange;
    }

    public void setBodyFatRange(String bodyFatRange) {
        this.bodyFatRange = bodyFatRange;
    }

    public String getFatFreeMass() {
        return fatFreeMass;
    }

    public void setFatFreeMass(String fatFreeMass) {
        this.fatFreeMass = fatFreeMass;
    }

    public Float getFatFreeMassFloat() {
        if (fatFreeMass != null) {
            fatFreeMass = fatFreeMass.replace(",", ".");
            fatFreeMass = fatFreeMass.replace("kg", "");
            return Float.parseFloat(fatFreeMass);
        } else {
            return null;
        }
    }

    public void setFatFreeMass(Float fatFreeMass) {
        this.fatFreeMass = fatFreeMass.toString();
    }

    public String getVisceralFatRating() {
        return visceralFatRating;
    }

    public void setVisceralFatRating(String visceralFatRating) {
        this.visceralFatRating = visceralFatRating;
    }

    public Integer getVisceralFatRatingInteger() {
        if (visceralFatRating != null) {
            return Integer.parseInt(visceralFatRating.trim());
        } else {
            return null;
        }
    }

    public void setVisceralFatRating(Float visceralFatRating) {
        this.visceralFatRating = visceralFatRating.toString();
    }

    public String getBodyWater() {
        return bodyWater;
    }

    public void setBodyWater(String bodyWater) {
        this.bodyWater = bodyWater;
    }

    public Float getBodyWaterFloat() {
        if (bodyWater != null) {
            bodyWater = bodyWater.replace(",", ".");
            bodyWater = bodyWater.replace("%", "");
            return Float.parseFloat(bodyWater);
        } else {
            return null;
        }
    }

    public void setBodyWater(Float bodyWater) {
        this.bodyWater = bodyWater.toString();
    }

    public String getBodyWaterMass() {
        return bodyWaterMass;
    }

    public void setBodyWaterMass(String bodyWaterMass) {
        this.bodyWaterMass = bodyWaterMass;
    }

    public Float getBodyWaterMassFloat() {
        if (bodyWaterMass != null) {
            bodyWaterMass = bodyWaterMass.replace(",", ".");
            bodyWaterMass = bodyWaterMass.replace("kg", "");
            return Float.parseFloat(bodyWaterMass);
        } else {
            return null;
        }
    }

    public void setBodyWaterMass(Float bodyWaterMass) {
        this.bodyWaterMass = bodyWaterMass.toString();
    }

    public String getMuscleMass() {
        return muscleMass;
    }

    public void setMuscleMass(String muscleMass) {
        this.muscleMass = muscleMass;
    }

    public Float getMuscleMassFloat() {
        if (muscleMass != null) {
            muscleMass = muscleMass.replace(",", ".");
            muscleMass = muscleMass.replace("kg", "");
            return Float.parseFloat(muscleMass);
        } else {
            return null;
        }
    }

    public void setMuscleMass(Float muscleMass) {
        this.muscleMass = muscleMass.toString();
    }

    public String getBoneMass() {
        return boneMass;
    }

    public void setBoneMass(String boneMass) {
        this.boneMass = boneMass;
    }

    public Float getBoneMassFloat() {
        if (boneMass != null) {
            boneMass = boneMass.replace(",", ".");
            boneMass = boneMass.replace("kg", "");
            return Float.parseFloat(boneMass);
        } else {
            return null;
        }
    }

    public void setBoneMass(Float boneMass) {
        this.boneMass = boneMass.toString();
    }

    public String getBasalMetabolicRate() {
        return basalMetabolicRate;
    }

    public void setBasalMetabolicRate(String basalMetabolicRate) {
        this.basalMetabolicRate = basalMetabolicRate;
    }

    public Float getBasalMetabolicRateFloat() {
        if (basalMetabolicRate != null) {
            basalMetabolicRate = basalMetabolicRate.replace(",", ".");
            basalMetabolicRate = basalMetabolicRate.replace("kcal", "");
            return Float.parseFloat(basalMetabolicRate);
        } else {
            return null;
        }
    }

    public void setBasalMetabolicRate(Float basalMetabolicRate) {
        this.basalMetabolicRate = basalMetabolicRate.toString();
    }

    public String getMetabolicAge() {
        return metabolicAge;
    }

    public void setMetabolicAge(String metabolicAge) {
        this.metabolicAge = metabolicAge;
    }

    public Float getMetabolicAgeFloat() {
        if (metabolicAge != null) {
            metabolicAge = metabolicAge.replace(",", ".");
            metabolicAge = metabolicAge.replace("yrs", "");
            return Float.parseFloat(metabolicAge);
        } else {
            return null;
        }
    }

    public void setMetabolicAge(Float metabolicAge) {
        this.metabolicAge = metabolicAge.toString();
    }

    public String getDailyCalorieIntake() {
        return dailyCalorieIntake;
    }

    public void setDailyCalorieIntake(String dailyCalorieIntake) {
        this.dailyCalorieIntake = dailyCalorieIntake;
    }

    public Float getDailyCalorieIntakeFloat() {
        if (dailyCalorieIntake != null) {
            dailyCalorieIntake = dailyCalorieIntake.replace(",", ".");
            dailyCalorieIntake = dailyCalorieIntake.replace("kcal", "");
            return Float.parseFloat(dailyCalorieIntake);
        } else {
            return null;
        }
    }

    public void setDailyCalorieIntake(Float dailyCalorieIntake) {
        this.dailyCalorieIntake = dailyCalorieIntake.toString();
    }

    public String getPhysiqueRating() {
        return physiqueRating;
    }

    public void setPhysiqueRating(String physiqueRating) {
        this.physiqueRating = physiqueRating;
    }

    public String getRightLegFat() {
        return rightLegFat;
    }

    public void setRightLegFat(String rightLegFat) {
        this.rightLegFat = rightLegFat;
    }

    public Float getRightLegFatFloat() {
        if (rightLegFat != null) {
            rightLegFat = rightLegFat.replace(",", ".");
            rightLegFat = rightLegFat.replace("%", "");
            return Float.parseFloat(rightLegFat);
        } else {
            return null;
        }
    }

    public void setRightLegFat(Float rightLegFat) {
        this.rightLegFat = rightLegFat.toString();
    }

    public String getLeftLegFat() {
        return leftLegFat;
    }

    public void setLeftLegFat(String LefLegFat) {
        this.leftLegFat = LefLegFat;
    }

    public Float getLeftLegFatFloat() {
        if (leftLegFat != null) {
            leftLegFat = leftLegFat.replace(",", ".");
            leftLegFat = leftLegFat.replace("%", "");
            return Float.parseFloat(leftLegFat);
        } else {
            return null;
        }
    }

    public void setLeftLegFat(Float LefLegFat) {
        this.leftLegFat = LefLegFat.toString();
    }

    public String getRightArmFat() {
        return rightArmFat;
    }

    public void setRightArmFat(String RightArmFat) {
        this.rightArmFat = RightArmFat;
    }

    public Float getRightArmFatFloat() {
        if (rightArmFat != null) {
            rightArmFat = rightArmFat.replace(",", ".");
            rightArmFat = rightArmFat.replace("%", "");
            return Float.parseFloat(rightArmFat);
        } else {
            return null;
        }
    }

    public void setRightArmFat(Float RightArmFat) {
        this.rightArmFat = RightArmFat.toString();
    }

    public String getLeftArmFat() {
        return leftArmFat;
    }

    public void setLeftArmFat(String LeftArmFat) {
        this.leftArmFat = LeftArmFat;
    }

    public Float getLeftArmFatFloat() {
        if (leftArmFat != null) {
            leftArmFat = leftArmFat.replace(",", ".");
            leftArmFat = leftArmFat.replace("%", "");
            return Float.parseFloat(leftArmFat);
        } else {
            return null;
        }
    }

    public void setLeftArmFat(Float LeftArmFat) {
        this.leftArmFat = LeftArmFat.toString();
    }

    public String getTrunkFat() {
        return trunkFat;
    }

    public void setTrunkFat(String TrunkFat) {
        this.trunkFat = TrunkFat;
    }

    public Float getTrunkFatFloat() {
        if (trunkFat != null) {
            trunkFat = trunkFat.replace(",", ".");
            trunkFat = trunkFat.replace("%", "");
            return Float.parseFloat(trunkFat);
        } else {
            return null;
        }
    }

    public void setTrunkFat(Float TrunkFat) {
        this.trunkFat = TrunkFat.toString();
    }

    public String getRightLegMuscleMass() {
        return rightLegMuscleMass;
    }

    public void setRightLegMuscleMass(String rightLegMuscleMass) {
        this.rightLegMuscleMass = rightLegMuscleMass;
    }

    public Float getRightLegMuscleMassFloat() {
        if (rightLegMuscleMass != null) {
            rightLegMuscleMass = rightLegMuscleMass.replace(",", ".");
            rightLegMuscleMass = rightLegMuscleMass.replace("kg", "");
            return Float.parseFloat(rightLegMuscleMass);
        } else {
            return null;
        }
    }

    public void setRightLegMuscleMass(Float rightLegMuscleMass) {
        this.rightLegMuscleMass = rightLegMuscleMass.toString();
    }

    public String getLeftLegMuscleMass() {
        return leftLegMuscleMass;
    }

    public void setLeftLegMuscleMass(String leftLegMuscleMass) {
        this.leftLegMuscleMass = leftLegMuscleMass;
    }

    public Float getLefLegMuscleMassFloat() {
        if (leftLegMuscleMass != null) {
            leftLegMuscleMass = leftLegMuscleMass.replace(",", ".");
            leftLegMuscleMass = leftLegMuscleMass.replace("kg", "");
            return Float.parseFloat(leftLegMuscleMass);
        } else {
            return null;
        }
    }

    public void setLefLegMuscleMass(Float LefLegMuscleMass) {
        this.leftLegMuscleMass = LefLegMuscleMass.toString();
    }

    public String getRightArmMuscleMass() {
        return rightArmMuscleMass;
    }

    public void setRightArmMuscleMass(String RightArmMuscleMass) {
        this.rightArmMuscleMass = RightArmMuscleMass;
    }

    public Float getRightArmMuscleMassFloat() {
        if (rightArmMuscleMass != null) {
            rightArmMuscleMass = rightArmMuscleMass.replace(",", ".");
            rightArmMuscleMass = rightArmMuscleMass.replace("kg", "");
            return Float.parseFloat(rightArmMuscleMass);
        } else {
            return null;
        }
    }

    public void setRightArmMuscleMass(Float RightArmMuscleMass) {
        this.rightArmMuscleMass = RightArmMuscleMass.toString();
    }

    public String getLefArmMuscleMass() {
        return leftArmMuscleMass;
    }

    public void setLefArmMuscleMass(String lefArmMuscleMass) {
        this.leftArmMuscleMass = lefArmMuscleMass;
    }

    public Float getLeftArmMuscleMassFloat() {
        if (leftArmMuscleMass != null) {
            leftArmMuscleMass = leftArmMuscleMass.replace(",", ".");
            leftArmMuscleMass = leftArmMuscleMass.replace("kg", "");
            return Float.parseFloat(leftArmMuscleMass);
        } else {
            return null;
        }
    }

    public void setLeftArmMuscleMass(Float LeftArmMuscleMass) {
        this.leftArmMuscleMass = LeftArmMuscleMass.toString();
    }

    public String getTrunkMuscleMass() {
        return trunkMuscleMass;
    }

    public void setTrunkMuscleMass(String TrunkMuscleMass) {
        this.trunkMuscleMass = TrunkMuscleMass;
    }

    public Float getTrunkMuscleMassFloat() {
        if (trunkMuscleMass != null) {
            trunkMuscleMass = trunkMuscleMass.replace(",", ".");
            trunkMuscleMass = trunkMuscleMass.replace("kg", "");
            return Float.parseFloat(trunkMuscleMass);
        } else {
            return null;
        }
    }

    public void setTrunkMuscleMass(Float TrunkMuscleMass) {
        this.trunkMuscleMass = TrunkMuscleMass.toString();
    }

    @Override
    public String toString() {
        String json = "{";
        json += "\"name\"=\"" + name + "\", ";
        json += "\"age\"=\"" + age + "\", ";
        json += "\"gender\"=\"" + gender + "\", ";
        json += "\"height\"=\"" + height + "\", ";
        json += "\"dateTime\"=\"" + dateTime + "\", ";
        json += "\"analyzer\"=\"" + analyzer + "\", ";
        json += "\"weight\"=\"" + weight + "\", ";
        json += "\"bodyMassIndex\"=\"" + bodyMassIndex + "\", ";
        json += "\"bodyFat\"=\"" + bodyFat + "\", ";
        json += "\"bodyFatMass\"=\"" + bodyFatMass + "\", ";
        json += "\"bodyFatRange\"=\"" + bodyFatRange + "\", ";
        json += "\"fatFreeMass\"=\"" + fatFreeMass + "\", ";
        json += "\"visceralFatRating\"=\"" + visceralFatRating + "\", ";
        json += "\"bodyWater\"=\"" + bodyWater + "\", ";
        json += "\"bodyWaterMass\"=\"" + bodyWaterMass + "\", ";
        json += "\"muscleMass\"=\"" + muscleMass + "\", ";
        json += "\"boneMass\"=\"" + boneMass + "\", ";
        json += "\"basalMetabolicRate\"=\"" + basalMetabolicRate + "\", ";
        json += "\"metabolicAge\"=\"" + metabolicAge + "\", ";
        json += "\"dailyCalorieIntake\"=\"" + dailyCalorieIntake + "\", ";
        json += "\"physiqueRating\"=\"" + physiqueRating + "\", ";
        json += "\"leftLegFat\"=\"" + leftLegFat + "\", ";
        json += "\"rightLegFat\"=\"" + rightLegFat + "\", ";
        json += "\"leftArmFat\"=\"" + leftArmFat + "\", ";
        json += "\"rightArmFat\"=\"" + rightArmFat + "\", ";
        json += "\"trunkFat\"=\"" + trunkFat + "\", ";
        json += "\"leftLegMuscleMass\"=\"" + leftLegMuscleMass + "\", ";
        json += "\"rightLegMuscleMass\"=\"" + rightLegMuscleMass + "\", ";
        json += "\"leftArmMuscleMass\"=\"" + leftArmMuscleMass + "\", ";
        json += "\"rightArmMuscleMass\"=\"" + rightArmMuscleMass + "\", ";
        json += "\"trunkMuscleMass\"=\"" + trunkMuscleMass + "\"";
        json += "}";
        return json;
    }

}