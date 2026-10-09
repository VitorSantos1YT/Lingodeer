package hh;

import android.os.Bundle;
import com.lingo.lingoskill.object.PdTips;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements tx.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f32274b = new p(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f32275c = new p(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f32276d = new p(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f32277e = new p(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32278a;

    public /* synthetic */ p(int i11) {
        this.f32278a = i11;
    }

    public static y0 a(PdTips tips) {
        kotlin.jvm.internal.m.f(tips, "tips");
        y0 y0Var = new y0();
        Bundle bundle = new Bundle();
        bundle.putParcelable(INTENTS.EXTRA_OBJECT, tips);
        bundle.putLong(INTENTS.EXTRA_LONG, -1L);
        bundle.putInt(INTENTS.EXTRA_INT, -1);
        bundle.putInt(INTENTS.EXTRA_INT_2, -1);
        y0Var.setArguments(bundle);
        return y0Var;
    }

    @Override // tx.c
    public void accept(Object obj) {
        switch (this.f32278a) {
            case 0:
                Throwable p4 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p4, "p0");
                p4.printStackTrace();
                break;
            case 1:
                Throwable p11 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p11, "p0");
                p11.printStackTrace();
                break;
            case 2:
                Throwable p12 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p12, "p0");
                p12.printStackTrace();
                break;
            default:
                Throwable p13 = (Throwable) obj;
                kotlin.jvm.internal.m.f(p13, "p0");
                p13.printStackTrace();
                break;
        }
    }
}
