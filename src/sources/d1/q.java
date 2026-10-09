package d1;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends xy.i implements fz.e {
    public final /* synthetic */ long H;
    public final /* synthetic */ r K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a00.e f22966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f22967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f22968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f22971f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CharSequence f22972t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j11, r rVar, CharSequence charSequence, vy.d dVar) {
        super(2, dVar);
        this.f22972t = charSequence;
        this.H = j11;
        this.K = rVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        q qVar = new q(this.H, this.K, this.f22972t, dVar);
        qVar.f22971f = obj;
        return qVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create(com.google.firebase.remoteconfig.a.a(obj), (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        long j11;
        a00.e eVar;
        r rVar;
        CharSequence charSequence;
        TextSelection textSelection;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f22970e;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            TextClassifier textClassifierA = com.google.firebase.remoteconfig.a.a(this.f22971f);
            long j12 = this.H;
            int iF = j3.x0.f(j12);
            int iE = j3.x0.e(j12);
            CharSequence charSequence2 = this.f22972t;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iF, iE);
            r rVar2 = this.K;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(rVar2.c());
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifierA.suggestSelection(defaultLocales.build());
            long jB = j3.t.b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i12 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f22969d = jB;
                this.f22970e = 2;
                if (r.a(this.K, this.f22972t, jB, textClassifierA, this) != aVar) {
                    j11 = jB;
                }
            } else {
                eVar = rVar2.f22979e;
                this.f22971f = textSelectionSuggestSelection;
                this.f22966a = eVar;
                this.f22967b = rVar2;
                this.f22968c = charSequence2;
                this.f22969d = jB;
                this.f22970e = 1;
                if (eVar.b(this) != aVar) {
                    rVar = rVar2;
                    charSequence = charSequence2;
                    textSelection = textSelectionSuggestSelection;
                    j11 = jB;
                    TextClassification textClassification = textSelection.getTextClassification();
                    kotlin.jvm.internal.m.c(textClassification);
                    rVar.f22981g.setValue(new n0(charSequence, j11, textClassification));
                }
            }
            return aVar;
        }
        if (i11 == 1) {
            j11 = this.f22969d;
            charSequence = this.f22968c;
            rVar = this.f22967b;
            eVar = this.f22966a;
            textSelection = (TextSelection) this.f22971f;
            com.bumptech.glide.e.F(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                kotlin.jvm.internal.m.c(textClassification2);
                rVar.f22981g.setValue(new n0(charSequence, j11, textClassification2));
            } finally {
                eVar.a(null);
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = this.f22969d;
            com.bumptech.glide.e.F(obj);
        }
        return new j3.x0(j11);
    }
}
