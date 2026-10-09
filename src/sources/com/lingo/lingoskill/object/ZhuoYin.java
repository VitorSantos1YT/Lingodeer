package com.lingo.lingoskill.object;

import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ZhuoYin extends BaseYintuIntel {
    public String LuoMa;
    public String Pian;
    public String Ping;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public long f21983id;

    public ZhuoYin(long j11, String str, String str2, String str3) {
        this.f21983id = j11;
        this.Ping = str;
        this.Pian = str2;
        this.LuoMa = str3;
    }

    @Override // com.lingo.lingoskill.object.BaseYintuIntel
    public long getId() {
        return this.f21983id;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return getId() > 0 ? 0 : 1;
    }

    @Override // com.lingo.lingoskill.object.BaseYintuIntel
    public String getLuoMa() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return x.n().jsLuomaDisplay == 0 ? this.LuoMa.split("#")[1] : this.LuoMa.split("#")[0];
    }

    @Override // com.lingo.lingoskill.object.BaseYintuIntel
    public String getPian() {
        return this.Pian;
    }

    @Override // com.lingo.lingoskill.object.BaseYintuIntel
    public String getPing() {
        return this.Ping;
    }

    public void setId(long j11) {
        this.f21983id = j11;
    }

    public void setLuoMa(String str) {
        this.LuoMa = str;
    }

    public void setPian(String str) {
        this.Pian = str;
    }

    public void setPing(String str) {
        this.Ping = str;
    }

    public ZhuoYin() {
    }
}
