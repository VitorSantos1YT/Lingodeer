package x0;

import android.app.RemoteAction;
import android.os.Parcelable;
import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Parcelable f55618b;

    public /* synthetic */ p(Parcelable parcelable, int i11) {
        this.f55617a = i11;
        this.f55618b = parcelable;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55617a) {
            case 0:
                ((Number) obj2).intValue();
                l1.s sVar = (l1.s) ((l1.n) obj);
                sVar.d0(950061013);
                String strValueOf = String.valueOf(((TextClassification) this.f55618b).getLabel());
                sVar.p(false);
                return strValueOf;
            default:
                ((Number) obj2).intValue();
                l1.s sVar2 = (l1.s) ((l1.n) obj);
                sVar2.d0(-1376593684);
                String string = ((RemoteAction) this.f55618b).getTitle().toString();
                sVar2.p(false);
                return string;
        }
    }
}
