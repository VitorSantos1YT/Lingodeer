package com.lingo.lingoskill.object;

import cf.x;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.lingo.lingoskill.LingoSkillApplication;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class HwCharacter implements MultiItemEntity {
    private int Animation;
    private String AnimationTipsTranARA;
    private String AnimationTipsTranCHN;
    private String AnimationTipsTranDEN;
    private String AnimationTipsTranENG;
    private String AnimationTipsTranFRN;
    private String AnimationTipsTranHINDI;
    private String AnimationTipsTranIDN;
    private String AnimationTipsTranITN;
    private String AnimationTipsTranJPN;
    private String AnimationTipsTranKRN;
    private String AnimationTipsTranPOL;
    private String AnimationTipsTranPTG;
    private String AnimationTipsTranRUS;
    private String AnimationTipsTranSPN;
    private String AnimationTipsTranTCHN;
    private String AnimationTipsTranTHAI;
    private String AnimationTipsTranTUR;
    private String AnimationTipsTranVTN;
    private long CharId;
    private int CharIdInLGCharacter;
    private String CharPath;
    private String Character;
    private int LevelIndex;
    private String Pinyin;
    private String TCharPath;
    private String TCharacter;
    private String TranARA;
    private String TranCHN;
    private String TranDEN;
    private String TranENG;
    private String TranFRN;
    private String TranHINDI;
    private String TranIDN;
    private String TranITN;
    private String TranJPN;
    private String TranKRN;
    private String TranPOL;
    private String TranPTG;
    private String TranRUS;
    private String TranSPN;
    private String TranTCHN;
    private String TranTHAI;
    private String TranTUR;
    private String TranVTN;

    public HwCharacter(long j11, String str, String str2, String str3, String str4, String str5, int i11, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, int i12, int i13) {
        this.CharId = j11;
        this.Character = str;
        this.TCharacter = str2;
        this.CharPath = str3;
        this.TCharPath = str4;
        this.Pinyin = str5;
        this.Animation = i11;
        this.TranCHN = str6;
        this.TranTCHN = str7;
        this.TranJPN = str8;
        this.TranKRN = str9;
        this.TranENG = str10;
        this.TranSPN = str11;
        this.TranFRN = str12;
        this.TranDEN = str13;
        this.TranITN = str14;
        this.TranPTG = str15;
        this.TranVTN = str16;
        this.TranRUS = str17;
        this.TranTUR = str18;
        this.TranIDN = str19;
        this.TranARA = str20;
        this.TranPOL = str21;
        this.TranTHAI = str22;
        this.TranHINDI = str23;
        this.AnimationTipsTranCHN = str24;
        this.AnimationTipsTranTCHN = str25;
        this.AnimationTipsTranJPN = str26;
        this.AnimationTipsTranKRN = str27;
        this.AnimationTipsTranENG = str28;
        this.AnimationTipsTranSPN = str29;
        this.AnimationTipsTranFRN = str30;
        this.AnimationTipsTranDEN = str31;
        this.AnimationTipsTranITN = str32;
        this.AnimationTipsTranPTG = str33;
        this.AnimationTipsTranVTN = str34;
        this.AnimationTipsTranRUS = str35;
        this.AnimationTipsTranTUR = str36;
        this.AnimationTipsTranIDN = str37;
        this.AnimationTipsTranARA = str38;
        this.AnimationTipsTranPOL = str39;
        this.AnimationTipsTranTHAI = str40;
        this.AnimationTipsTranHINDI = str41;
        this.LevelIndex = i12;
        this.CharIdInLGCharacter = i13;
    }

    public int getAnimation() {
        return this.Animation;
    }

    public String getAnimationExplanation() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().locateLanguage == 1 && !getTranJPN().isEmpty()) {
            return getAnimationTipsTranJPN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 2 && !getAnimationTipsTranKRN().isEmpty()) {
            return getAnimationTipsTranKRN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 4 && !getAnimationTipsTranSPN().isEmpty()) {
            return getAnimationTipsTranSPN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 5 && !getAnimationTipsTranFRN().isEmpty()) {
            return getAnimationTipsTranFRN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 6 && !getAnimationTipsTranDEN().isEmpty()) {
            return getAnimationTipsTranDEN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 20 && !getAnimationTipsTranITN().isEmpty()) {
            return getAnimationTipsTranITN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 10 && !getAnimationTipsTranRUS().isEmpty()) {
            return getAnimationTipsTranRUS().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 8 && !getAnimationTipsTranPTG().isEmpty()) {
            return getAnimationTipsTranPTG().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 7 && !getAnimationTipsTranVTN().isEmpty()) {
            return getAnimationTipsTranVTN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 18 && !getAnimationTipsTranIDN().isEmpty()) {
            return getAnimationTipsTranIDN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage != 51 || getAnimationTipsTranARA().isEmpty()) {
            return (x.n().locateLanguage != 57 || getAnimationTipsTranTHAI().isEmpty()) ? getAnimationTipsTranENG().replace("!@@@!", "/") : getAnimationTipsTranTHAI().replace("!@@@!", "/");
        }
        return getAnimationTipsTranARA().replace("!@@@!", "/");
    }

    public String getAnimationTipsTranARA() {
        return this.AnimationTipsTranARA;
    }

    public String getAnimationTipsTranCHN() {
        return this.AnimationTipsTranCHN;
    }

    public String getAnimationTipsTranDEN() {
        return this.AnimationTipsTranDEN;
    }

    public String getAnimationTipsTranENG() {
        return this.AnimationTipsTranENG;
    }

    public String getAnimationTipsTranFRN() {
        return this.AnimationTipsTranFRN;
    }

    public String getAnimationTipsTranHINDI() {
        return this.AnimationTipsTranHINDI;
    }

    public String getAnimationTipsTranIDN() {
        return this.AnimationTipsTranIDN;
    }

    public String getAnimationTipsTranITN() {
        return this.AnimationTipsTranITN;
    }

    public String getAnimationTipsTranJPN() {
        return this.AnimationTipsTranJPN;
    }

    public String getAnimationTipsTranKRN() {
        return this.AnimationTipsTranKRN;
    }

    public String getAnimationTipsTranPOL() {
        return this.AnimationTipsTranPOL;
    }

    public String getAnimationTipsTranPTG() {
        return this.AnimationTipsTranPTG;
    }

    public String getAnimationTipsTranRUS() {
        return this.AnimationTipsTranRUS;
    }

    public String getAnimationTipsTranSPN() {
        return this.AnimationTipsTranSPN;
    }

    public String getAnimationTipsTranTCHN() {
        return this.AnimationTipsTranTCHN;
    }

    public String getAnimationTipsTranTHAI() {
        return this.AnimationTipsTranTHAI;
    }

    public String getAnimationTipsTranTUR() {
        return this.AnimationTipsTranTUR;
    }

    public String getAnimationTipsTranVTN() {
        return this.AnimationTipsTranVTN;
    }

    public long getCharId() {
        return this.CharId;
    }

    public int getCharIdInLGCharacter() {
        return this.CharIdInLGCharacter;
    }

    public String getCharPath() {
        return this.CharPath;
    }

    public String getCharacter() {
        return this.Character;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return 2;
    }

    public int getLevelIndex() {
        return this.LevelIndex;
    }

    public String getPinyin() {
        return this.Pinyin;
    }

    public String getShowCharPath() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return (x.n().isSChinese || this.Character.equals(this.TCharacter) || !(x.n().keyLanguage == 0 || x.n().keyLanguage == 11)) ? this.CharPath : this.TCharPath;
    }

    public String getShowCharacter() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return !x.n().isSChinese ? this.TCharacter : this.Character;
    }

    public String getTCharPath() {
        return this.TCharPath;
    }

    public String getTCharacter() {
        return this.TCharacter;
    }

    public String getTranARA() {
        return this.TranARA;
    }

    public String getTranCHN() {
        return this.TranCHN;
    }

    public String getTranDEN() {
        return this.TranDEN;
    }

    public String getTranENG() {
        return this.TranENG;
    }

    public String getTranFRN() {
        return this.TranFRN;
    }

    public String getTranHINDI() {
        return this.TranHINDI;
    }

    public String getTranIDN() {
        return this.TranIDN;
    }

    public String getTranITN() {
        return this.TranITN;
    }

    public String getTranJPN() {
        return this.TranJPN;
    }

    public String getTranKRN() {
        return this.TranKRN;
    }

    public String getTranPOL() {
        return this.TranPOL;
    }

    public String getTranPTG() {
        return this.TranPTG;
    }

    public String getTranRUS() {
        return this.TranRUS;
    }

    public String getTranSPN() {
        return this.TranSPN;
    }

    public String getTranTCHN() {
        return this.TranTCHN;
    }

    public String getTranTHAI() {
        return this.TranTHAI;
    }

    public String getTranTUR() {
        return this.TranTUR;
    }

    public String getTranVTN() {
        return this.TranVTN;
    }

    public String getTranslation() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().locateLanguage == 1 && !getTranJPN().isEmpty()) {
            return getTranJPN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 2 && !getTranKRN().isEmpty()) {
            return getTranKRN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 4 && !getTranSPN().isEmpty()) {
            return getTranSPN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 5 && !getTranFRN().isEmpty()) {
            return getTranFRN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 6 && !getTranDEN().isEmpty()) {
            return getTranDEN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 20 && !getTranITN().isEmpty()) {
            return getTranITN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 10 && !getTranRUS().isEmpty()) {
            return getTranRUS().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 8 && !getTranPTG().isEmpty()) {
            return getTranPTG().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 7 && !getTranVTN().isEmpty()) {
            return getTranVTN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage == 18 && !getTranIDN().isEmpty()) {
            return getTranIDN().replace("!@@@!", "/");
        }
        if (x.n().locateLanguage != 51 || getTranARA().isEmpty()) {
            return (x.n().locateLanguage != 57 || getTranTHAI().isEmpty()) ? getTranENG().replace("!@@@!", "/") : getTranTHAI().replace("!@@@!", "/");
        }
        return getTranARA().replace("!@@@!", "/");
    }

    public void setAnimation(int i11) {
        this.Animation = i11;
    }

    public void setAnimationTipsTranARA(String str) {
        this.AnimationTipsTranARA = str;
    }

    public void setAnimationTipsTranCHN(String str) {
        this.AnimationTipsTranCHN = str;
    }

    public void setAnimationTipsTranDEN(String str) {
        this.AnimationTipsTranDEN = str;
    }

    public void setAnimationTipsTranENG(String str) {
        this.AnimationTipsTranENG = str;
    }

    public void setAnimationTipsTranFRN(String str) {
        this.AnimationTipsTranFRN = str;
    }

    public void setAnimationTipsTranHINDI(String str) {
        this.AnimationTipsTranHINDI = str;
    }

    public void setAnimationTipsTranIDN(String str) {
        this.AnimationTipsTranIDN = str;
    }

    public void setAnimationTipsTranITN(String str) {
        this.AnimationTipsTranITN = str;
    }

    public void setAnimationTipsTranJPN(String str) {
        this.AnimationTipsTranJPN = str;
    }

    public void setAnimationTipsTranKRN(String str) {
        this.AnimationTipsTranKRN = str;
    }

    public void setAnimationTipsTranPOL(String str) {
        this.AnimationTipsTranPOL = str;
    }

    public void setAnimationTipsTranPTG(String str) {
        this.AnimationTipsTranPTG = str;
    }

    public void setAnimationTipsTranRUS(String str) {
        this.AnimationTipsTranRUS = str;
    }

    public void setAnimationTipsTranSPN(String str) {
        this.AnimationTipsTranSPN = str;
    }

    public void setAnimationTipsTranTCHN(String str) {
        this.AnimationTipsTranTCHN = str;
    }

    public void setAnimationTipsTranTHAI(String str) {
        this.AnimationTipsTranTHAI = str;
    }

    public void setAnimationTipsTranTUR(String str) {
        this.AnimationTipsTranTUR = str;
    }

    public void setAnimationTipsTranVTN(String str) {
        this.AnimationTipsTranVTN = str;
    }

    public void setCharId(long j11) {
        this.CharId = j11;
    }

    public void setCharIdInLGCharacter(int i11) {
        this.CharIdInLGCharacter = i11;
    }

    public void setCharPath(String str) {
        this.CharPath = str;
    }

    public void setCharacter(String str) {
        this.Character = str;
    }

    public void setLevelIndex(int i11) {
        this.LevelIndex = i11;
    }

    public void setPinyin(String str) {
        this.Pinyin = str;
    }

    public void setTCharPath(String str) {
        this.TCharPath = str;
    }

    public void setTCharacter(String str) {
        this.TCharacter = str;
    }

    public void setTranARA(String str) {
        this.TranARA = str;
    }

    public void setTranCHN(String str) {
        this.TranCHN = str;
    }

    public void setTranDEN(String str) {
        this.TranDEN = str;
    }

    public void setTranENG(String str) {
        this.TranENG = str;
    }

    public void setTranFRN(String str) {
        this.TranFRN = str;
    }

    public void setTranHINDI(String str) {
        this.TranHINDI = str;
    }

    public void setTranIDN(String str) {
        this.TranIDN = str;
    }

    public void setTranITN(String str) {
        this.TranITN = str;
    }

    public void setTranJPN(String str) {
        this.TranJPN = str;
    }

    public void setTranKRN(String str) {
        this.TranKRN = str;
    }

    public void setTranPOL(String str) {
        this.TranPOL = str;
    }

    public void setTranPTG(String str) {
        this.TranPTG = str;
    }

    public void setTranRUS(String str) {
        this.TranRUS = str;
    }

    public void setTranSPN(String str) {
        this.TranSPN = str;
    }

    public void setTranTCHN(String str) {
        this.TranTCHN = str;
    }

    public void setTranTHAI(String str) {
        this.TranTHAI = str;
    }

    public void setTranTUR(String str) {
        this.TranTUR = str;
    }

    public void setTranVTN(String str) {
        this.TranVTN = str;
    }

    public HwCharacter() {
    }
}
