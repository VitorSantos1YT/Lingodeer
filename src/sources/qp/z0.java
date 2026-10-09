package qp;

import android.widget.TextView;
import com.lingo.lingoskill.object.LDCharacter;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.unity.exception.NoSuchElemException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends n4 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f48278t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f48279u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f48280v;

    public z0(mp.b bVar, long j11, ArrayList arrayList) {
        super(bVar, j11, arrayList);
        this.f48278t = arrayList;
        this.f48279u = 2;
        this.f48280v = nv.p.m(j11, "2;", ";2");
    }

    @Override // qp.n4
    public final void A(TextView textView) {
        textView.setTextSize(32.0f);
    }

    @Override // qp.n4, qp.a, hi.a
    public final String c() {
        return this.f48280v;
    }

    @Override // qp.n4, hi.a
    public final List g() {
        ArrayList arrayList = new ArrayList();
        Iterator it = v().iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Word word = (Word) it.next();
            qy.q qVar = fv.b.f28186a;
            String zhuyin = word.getZhuyin();
            kotlin.jvm.internal.m.e(zhuyin, "getZhuyin(...)");
            String strE = fv.b.e(zhuyin);
            String zhuyin2 = word.getZhuyin();
            kotlin.jvm.internal.m.e(zhuyin2, "getZhuyin(...)");
            arrayList.add(new fv.a(1L, strE, fv.b.a(zhuyin2, null, null)));
        }
        return arrayList;
    }

    @Override // qp.n4, hi.a
    public final int i() {
        return this.f48279u;
    }

    @Override // qp.n4, hi.a
    public final void j() throws NoSuchElemException {
        List list = this.f48278t;
        if (list == null) {
            throw new NoSuchElemException();
        }
        this.f48081l = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LDCharacter lDCharacterLoadFullObject = LDCharacter.loadFullObject(((Number) it.next()).longValue());
            if (lDCharacterLoadFullObject != null) {
                Word word = new Word();
                word.setWordId(lDCharacterLoadFullObject.getCharId());
                word.setWord(lDCharacterLoadFullObject.getCharacter());
                word.setZhuyin(lDCharacterLoadFullObject.getAudioName());
                word.setTranslations(lDCharacterLoadFullObject.getPinyin());
                word.setLuoma(BuildConfig.VERSION_NAME);
                v().add(word);
            }
        }
        if (v().isEmpty()) {
            throw new NoSuchElemException();
        }
    }

    @Override // qp.n4
    public final List w() {
        return this.f48278t;
    }

    @Override // qp.n4
    public final void x(Word word) {
        qy.q qVar = fv.b.f28186a;
        String zhuyin = word.getZhuyin();
        kotlin.jvm.internal.m.e(zhuyin, "getZhuyin(...)");
        ((jp.p0) this.f47881a).I(fv.b.c(zhuyin, null, null));
    }

    @Override // qp.n4
    public final void z(TextView textView) {
        v10.c.G(textView);
        textView.setTextSize(32.0f);
        textView.postDelayed(new b2.c(4, textView, new w0(textView, 2)), 0L);
    }
}
