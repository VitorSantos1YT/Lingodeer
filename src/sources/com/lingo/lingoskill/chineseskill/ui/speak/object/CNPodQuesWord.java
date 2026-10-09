package com.lingo.lingoskill.chineseskill.ui.speak.object;

import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import op.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class CNPodQuesWord extends a {
    private String luoma;
    private String word;
    private String zhuyin;

    @Override // com.lingo.lingoskill.object.Word
    public String getLuoma() {
        return this.luoma;
    }

    @Override // com.lingo.lingoskill.object.Word
    public String getWord() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        return x.n().isSChinese ? this.word : getLuoma();
    }

    @Override // com.lingo.lingoskill.object.Word
    public String getZhuyin() {
        return this.zhuyin;
    }

    @Override // com.lingo.lingoskill.object.Word
    public void setLuoma(String str) {
        this.luoma = str;
    }

    @Override // com.lingo.lingoskill.object.Word
    public void setWord(String str) {
        this.word = str;
    }

    @Override // com.lingo.lingoskill.object.Word
    public void setZhuyin(String str) {
        this.zhuyin = str;
    }
}
