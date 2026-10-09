package bp;

import com.lingodeer.database.model.LanguageHistoryEntity;
import h1.o9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LanguageHistoryEntity f4931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4932c;

    public z0(boolean z11, LanguageHistoryEntity languageHistoryEntity, l1.b1 b1Var) {
        this.f4930a = z11;
        this.f4931b = languageHistoryEntity;
        this.f4932c = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean z11;
        o9 value = (o9) obj;
        kotlin.jvm.internal.m.f(value, "value");
        if (value == o9.EndToStart && this.f4930a) {
            this.f4932c.setValue(this.f4931b);
            z11 = false;
        } else {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
