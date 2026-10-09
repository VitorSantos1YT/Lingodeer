package com.lingo.lingoskill.object;

import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class HwCharGroup {
    private long PartGroupId;
    private int PartGroupIndex;
    private String PartGroupList;
    private String PartGroupName;
    private String TPartGroupList;
    private String TPartGroupName;

    public HwCharGroup(long j11, int i11, String str, String str2, String str3, String str4) {
        this.PartGroupId = j11;
        this.PartGroupIndex = i11;
        this.PartGroupList = str;
        this.PartGroupName = str2;
        this.TPartGroupList = str3;
        this.TPartGroupName = str4;
    }

    public long getPartGroupId() {
        return this.PartGroupId;
    }

    public int getPartGroupIndex() {
        return this.PartGroupIndex;
    }

    public String getPartGroupList() {
        return this.PartGroupList;
    }

    public String getPartGroupName() {
        return this.PartGroupName;
    }

    public String getShowPartGroupList() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return (x.n().isSChinese || x.n().keyLanguage != 0) ? this.PartGroupList : this.TPartGroupList;
    }

    public String getShowPartGroupName() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return (x.n().isSChinese || x.n().keyLanguage != 0) ? this.PartGroupName : this.TPartGroupName;
    }

    public String getTPartGroupList() {
        return this.TPartGroupList;
    }

    public String getTPartGroupName() {
        return this.TPartGroupName;
    }

    public void setPartGroupId(long j11) {
        this.PartGroupId = j11;
    }

    public void setPartGroupIndex(int i11) {
        this.PartGroupIndex = i11;
    }

    public void setPartGroupList(String str) {
        this.PartGroupList = str;
    }

    public void setPartGroupName(String str) {
        this.PartGroupName = str;
    }

    public void setTPartGroupList(String str) {
        this.TPartGroupList = str;
    }

    public void setTPartGroupName(String str) {
        this.TPartGroupName = str;
    }

    public HwCharGroup() {
    }
}
