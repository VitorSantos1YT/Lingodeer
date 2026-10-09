package com.lingo.lingoskill.ruskill.ui.speak.object;

import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import op.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RUPodQuesWord extends a {
    private String luoma;
    private String word;
    private String zhuyin;

    @Override // com.lingo.lingoskill.object.Word
    public String getLuoma() {
        String str;
        if (this.luoma.split("#").length > 1) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            str = x.n().jsLuomaDisplay == 0 ? this.luoma.split("#")[1] : this.luoma.split("#")[0];
        } else {
            str = this.luoma;
        }
        return str.replace("_", " ");
    }

    @Override // com.lingo.lingoskill.object.Word
    public String getWord() {
        return this.word.replace("■", " ");
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
