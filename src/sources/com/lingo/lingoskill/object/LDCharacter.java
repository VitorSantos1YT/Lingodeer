package com.lingo.lingoskill.object;

import android.database.Cursor;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import ij.d;
import java.util.ArrayList;
import java.util.List;
import k10.g;
import k10.h;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LDCharacter {
    private String AudioName;
    private long CharId;
    private String Character;
    private String DirCode;
    private String GanRao;
    private String Lessons;
    private String PartAnswer;
    private String PartOptions;
    private String Pinyin;
    private String TCharacter;
    private String TPartAnswer;
    private String TPartOptions;
    private String Translation;
    private LDCharacter mainCharacter;
    private List<LDCharacter> optionList;

    public LDCharacter(long j11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.CharId = j11;
        this.Character = str;
        this.TCharacter = str2;
        this.Pinyin = str3;
        this.AudioName = str4;
        this.DirCode = str5;
        this.Translation = str6;
        this.Lessons = str7;
        this.PartOptions = str8;
        this.PartAnswer = str9;
        this.TPartOptions = str10;
        this.TPartAnswer = str11;
        this.GanRao = str12;
    }

    public static boolean checkSimpleObject(long j11) {
        if (d.f34419e == null) {
            synchronized (d.class) {
                if (d.f34419e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    d.f34419e = new d(lingoSkillApplication);
                }
            }
        }
        d dVar = d.f34419e;
        m.c(dVar);
        g gVarQueryBuilder = dVar.n().queryBuilder();
        gVarQueryBuilder.f(LDCharacterDao.Properties.CharId.b(Long.valueOf(j11)), new h[0]);
        gVarQueryBuilder.f37855f = 1;
        Cursor cursorC = gVarQueryBuilder.b().c();
        if (cursorC.moveToNext()) {
            cursorC.close();
            return true;
        }
        cursorC.close();
        return false;
    }

    public static LDCharacter loadFullObject(long j11) {
        try {
            if (d.f34419e == null) {
                synchronized (d.class) {
                    if (d.f34419e == null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        m.c(lingoSkillApplication);
                        d.f34419e = new d(lingoSkillApplication);
                    }
                }
            }
            d dVar = d.f34419e;
            m.c(dVar);
            g gVarQueryBuilder = dVar.n().queryBuilder();
            gVarQueryBuilder.f(LDCharacterDao.Properties.CharId.b(Long.valueOf(j11)), new h[0]);
            gVarQueryBuilder.f37855f = 1;
            LDCharacter lDCharacter = (LDCharacter) gVarQueryBuilder.d().get(0);
            ArrayList arrayList = new ArrayList();
            for (Long l9 : ew.a.v(lDCharacter.getGanRao())) {
                if (d.f34419e == null) {
                    synchronized (d.class) {
                        if (d.f34419e == null) {
                            LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                            m.c(lingoSkillApplication2);
                            d.f34419e = new d(lingoSkillApplication2);
                        }
                    }
                }
                d dVar2 = d.f34419e;
                m.c(dVar2);
                LDCharacter lDCharacter2 = (LDCharacter) dVar2.n().load(l9);
                if (lDCharacter2 != null) {
                    arrayList.add(lDCharacter2);
                }
            }
            lDCharacter.setOptionList(arrayList);
            if (d.f34419e == null) {
                synchronized (d.class) {
                    if (d.f34419e == null) {
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        m.c(lingoSkillApplication3);
                        d.f34419e = new d(lingoSkillApplication3);
                    }
                }
            }
            d dVar3 = d.f34419e;
            m.c(dVar3);
            lDCharacter.setMainCharacter((LDCharacter) dVar3.n().load(Long.valueOf(j11)));
            return lDCharacter;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public String getAudioName() {
        return this.AudioName;
    }

    public long getCharId() {
        return this.CharId;
    }

    public String getCharacter() {
        return this.Character;
    }

    public String getDirCode() {
        return this.DirCode;
    }

    public String getGanRao() {
        return this.GanRao;
    }

    public String getLessons() {
        return this.Lessons;
    }

    public LDCharacter getMainCharacter() {
        return this.mainCharacter;
    }

    public List<LDCharacter> getOptionList() {
        return this.optionList;
    }

    public String getPartAnswer() {
        return this.PartAnswer;
    }

    public String getPartOptions() {
        return this.PartOptions;
    }

    public String getPinyin() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (x.n().locateLanguage == 9) {
            if (this.Pinyin.equals("Ahmed")) {
                return "艾哈邁德";
            }
            if (this.Pinyin.equals("Amina")) {
                return "艾米娜";
            }
            if (this.Pinyin.equals("Amin")) {
                return "艾敏";
            }
            if (this.Pinyin.equals("Maria")) {
                return "瑪麗亞";
            }
        }
        return this.Pinyin;
    }

    public String getTCharacter() {
        return this.TCharacter;
    }

    public String getTPartAnswer() {
        return this.TPartAnswer;
    }

    public String getTPartOptions() {
        return this.TPartOptions;
    }

    public String getTranslation() {
        return this.Translation;
    }

    public void setAudioName(String str) {
        this.AudioName = str;
    }

    public void setCharId(long j11) {
        this.CharId = j11;
    }

    public void setCharacter(String str) {
        this.Character = str;
    }

    public void setDirCode(String str) {
        this.DirCode = str;
    }

    public void setGanRao(String str) {
        this.GanRao = str;
    }

    public void setLessons(String str) {
        this.Lessons = str;
    }

    public void setMainCharacter(LDCharacter lDCharacter) {
        this.mainCharacter = lDCharacter;
    }

    public void setOptionList(List<LDCharacter> list) {
        this.optionList = list;
    }

    public void setPartAnswer(String str) {
        this.PartAnswer = str;
    }

    public void setPartOptions(String str) {
        this.PartOptions = str;
    }

    public void setPinyin(String str) {
        this.Pinyin = str;
    }

    public void setTCharacter(String str) {
        this.TCharacter = str;
    }

    public void setTPartAnswer(String str) {
        this.TPartAnswer = str;
    }

    public void setTPartOptions(String str) {
        this.TPartOptions = str;
    }

    public void setTranslation(String str) {
        this.Translation = str;
    }

    public LDCharacter() {
    }
}
