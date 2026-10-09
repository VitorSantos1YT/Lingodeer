package d1;

import android.app.RemoteAction;
import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l1.c3;
import l1.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vy.i f22975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f22976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f22977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q3.b f22978d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextClassifier f22980f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a00.e f22979e = new a00.e();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f22981g = l1.t.B(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f22982h = new Object();

    public r(vy.i iVar, Context context, u uVar, q3.b bVar) {
        this.f22975a = iVar;
        this.f22976b = context;
        this.f22977c = uVar;
        this.f22978d = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object a(r rVar, CharSequence charSequence, long j11, TextClassifier textClassifier, xy.c cVar) {
        n nVar;
        long j12;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        a00.e eVar;
        TextClassification textClassificationClassifyText;
        long j13;
        CharSequence charSequence3;
        a00.e eVar2 = rVar.f22979e;
        k1 k1Var = rVar.f22981g;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i11 = nVar.f22942t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f22942t = i11 - Integer.MIN_VALUE;
            } else {
                nVar = new n(rVar, cVar);
            }
        } else {
            nVar = new n(rVar, cVar);
        }
        Object obj = nVar.f22940e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = nVar.f22942t;
        qy.b0 b0Var = qy.b0.f48488a;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(obj);
                nVar.f22936a = charSequence;
                nVar.f22937b = textClassifier;
                nVar.f22938c = eVar2;
                j12 = j11;
                nVar.f22939d = j12;
                nVar.f22942t = 1;
                if (eVar2.b(nVar) != aVar) {
                    charSequence2 = charSequence;
                    textClassifier2 = textClassifier;
                    eVar = eVar2;
                }
                return aVar;
            }
            if (i12 == 1) {
                j12 = nVar.f22939d;
                eVar = nVar.f22938c;
                textClassifier2 = (TextClassifier) nVar.f22937b;
                charSequence2 = nVar.f22936a;
                com.bumptech.glide.e.F(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j13 = nVar.f22939d;
                eVar2 = nVar.f22938c;
                textClassificationClassifyText = (TextClassification) nVar.f22937b;
                charSequence3 = nVar.f22936a;
                com.bumptech.glide.e.F(obj);
            }
            try {
                k1Var.setValue(new n0(charSequence3, j13, textClassificationClassifyText));
                return b0Var;
            } finally {
                eVar2.a(null);
            }
            n0 n0Var = (n0) k1Var.getValue();
            if (n0Var != null) {
                c3 c3Var = s.f22986a;
                if (j3.x0.b(j12, n0Var.f22944b) && kotlin.jvm.internal.m.a(charSequence2, n0Var.f22943a)) {
                    eVar.a(null);
                    return b0Var;
                }
            }
            eVar.a(null);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, j3.x0.f(j12), j3.x0.e(j12)).setDefaultLocales(rVar.c()).build());
            nVar.f22936a = charSequence2;
            nVar.f22937b = textClassificationClassifyText;
            nVar.f22938c = eVar2;
            nVar.f22939d = j12;
            nVar.f22942t = 2;
            if (eVar2.b(nVar) != aVar) {
                j13 = j12;
                charSequence3 = charSequence2;
                k1Var.setValue(new n0(charSequence3, j13, textClassificationClassifyText));
                return b0Var;
            }
            return aVar;
        } catch (Throwable th2) {
            eVar.a(null);
            throw th2;
        }
    }

    public final void b(u0.a aVar, String str, long j11, aj.c cVar) throws Exception {
        a00.e eVar = this.f22979e;
        TextClassification textClassification = null;
        if (eVar.g()) {
            n0 n0Var = (n0) this.f22981g.getValue();
            TextClassification textClassification2 = (n0Var != null && j3.x0.b(j11, n0Var.f22944b) && kotlin.jvm.internal.m.a(str, n0Var.f22943a)) ? n0Var.f22945c : null;
            eVar.a(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            cVar.invoke(aVar);
            return;
        }
        boolean zIsEmpty = textClassification.getActions().isEmpty();
        Object obj = this.f22982h;
        if (!zIsEmpty) {
            aVar.f52716a.a(new v0.h(obj, textClassification, 0));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            aVar.f52716a.a(new v0.h(obj, textClassification, -1));
        }
        cVar.invoke(aVar);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i11 = 0; i11 < size; i11++) {
            actions.get(i11);
            if (i11 > 0) {
                aVar.f52716a.a(new v0.h(obj, textClassification, i11));
            }
        }
    }

    public final LocaleList c() {
        q3.b bVar = this.f22978d;
        if (bVar == null) {
            return new LocaleList(((q3.a) q3.c.f47421a.y().f47419a.get(0)).f47417a);
        }
        ArrayList arrayList = new ArrayList(ry.n.W(bVar, 10));
        Iterator it = bVar.f47419a.iterator();
        while (it.hasNext()) {
            arrayList.add(((q3.a) it.next()).f47417a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
