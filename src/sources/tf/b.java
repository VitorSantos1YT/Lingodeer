package tf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import lf.j1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52142a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        switch (this.f52142a) {
            case 0:
                kotlin.jvm.internal.m.f(source, "source");
                return new c(source);
            case 1:
                kotlin.jvm.internal.m.f(source, "parcel");
                i iVar = new i();
                iVar.f52181a = source.readString();
                iVar.f52182b = source.readString();
                iVar.f52183c = source.readString();
                iVar.f52184d = source.readLong();
                iVar.f52185e = source.readLong();
                return iVar;
            case 2:
                kotlin.jvm.internal.m.f(source, "source");
                return new l(source);
            case 3:
                kotlin.jvm.internal.m.f(source, "source");
                return new p(source);
            case 4:
                kotlin.jvm.internal.m.f(source, "source");
                return new q(source);
            case 5:
                kotlin.jvm.internal.m.f(source, "source");
                return new r(source);
            case 6:
                kotlin.jvm.internal.m.f(source, "source");
                w wVar = new w();
                wVar.f52229b = -1;
                Parcelable[] parcelableArray = source.readParcelableArray(e0.class.getClassLoader());
                if (parcelableArray == null) {
                    parcelableArray = new Parcelable[0];
                }
                ArrayList arrayList = new ArrayList();
                int length = parcelableArray.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        wVar.f52228a = (e0[]) arrayList.toArray(new e0[0]);
                        wVar.f52229b = source.readInt();
                        wVar.f52234t = (t) source.readParcelable(t.class.getClassLoader());
                        HashMap mapH = j1.H(source);
                        wVar.H = mapH != null ? ry.x.k0(mapH) : null;
                        HashMap mapH2 = j1.H(source);
                        wVar.K = mapH2 != null ? ry.x.k0(mapH2) : null;
                        return wVar;
                    }
                    Parcelable parcelable = parcelableArray[i11];
                    e0 e0Var = parcelable instanceof e0 ? (e0) parcelable : null;
                    if (e0Var != null) {
                        e0Var.f52166b = wVar;
                    }
                    if (e0Var != null) {
                        arrayList.add(e0Var);
                    }
                    i11++;
                }
                break;
            case 7:
                kotlin.jvm.internal.m.f(source, "source");
                return new t(source);
            case 8:
                kotlin.jvm.internal.m.f(source, "source");
                return new v(source);
            default:
                kotlin.jvm.internal.m.f(source, "source");
                return new l0(source);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f52142a) {
            case 0:
                return new c[i11];
            case 1:
                return new i[i11];
            case 2:
                return new l[i11];
            case 3:
                return new p[i11];
            case 4:
                return new q[i11];
            case 5:
                return new r[i11];
            case 6:
                return new w[i11];
            case 7:
                return new t[i11];
            case 8:
                return new v[i11];
            default:
                return new l0[i11];
        }
    }
}
