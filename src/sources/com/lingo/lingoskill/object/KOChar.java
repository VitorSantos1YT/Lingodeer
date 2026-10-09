package com.lingo.lingoskill.object;

import com.lingo.lingoskill.LingoSkillApplication;
import k10.g;
import k10.h;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class KOChar extends o00.a {
    private long CharId;
    private String CharPath;
    private String Character;

    public KOChar() {
        super(12);
    }

    public long getCharId() {
        return this.CharId;
    }

    public String getCharPath() {
        return this.CharPath;
    }

    public String getCharacter() {
        return this.Character;
    }

    public String getZhuyin() {
        if (wm.a.f55177e == null) {
            synchronized (wm.a.class) {
                if (wm.a.f55177e == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    m.c(lingoSkillApplication);
                    wm.a.f55177e = new wm.a(lingoSkillApplication);
                }
            }
        }
        wm.a aVar = wm.a.f55177e;
        m.c(aVar);
        g gVarQueryBuilder = aVar.f55181d.queryBuilder();
        gVarQueryBuilder.f(KOCharZhuyinDao.Properties.Character.b(getCharacter()), new h[0]);
        gVarQueryBuilder.f37855f = 1;
        return ((KOCharZhuyin) gVarQueryBuilder.d().get(0)).getZhuyin();
    }

    public void setCharId(long j11) {
        this.CharId = j11;
    }

    public void setCharPath(String str) {
        this.CharPath = str;
    }

    public void setCharacter(String str) {
        this.Character = str;
    }

    public KOChar(long j11, String str, String str2) {
        super(12);
        this.CharId = j11;
        this.Character = str;
        this.CharPath = str2;
    }
}
