package bp;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4531b;

    public /* synthetic */ d1(int i11, ArrayList arrayList) {
        this.f4530a = i11;
        this.f4531b = arrayList;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f4530a) {
            case 0:
                this.f4531b.get(((Number) obj).intValue());
                return null;
            case 1:
                this.f4531b.get(((Number) obj).intValue());
                return null;
            case 2:
                ArrayList arrayList = this.f4531b;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                }
                return qy.b0.f48488a;
            case 3:
                this.f4531b.get(((Number) obj).intValue());
                return null;
            case 4:
                this.f4531b.get(((Number) obj).intValue());
                return null;
            case 5:
                this.f4531b.get(((Number) obj).intValue());
                return null;
            case 6:
                this.f4531b.get(((Number) obj).intValue());
                return null;
            default:
                this.f4531b.get(((Number) obj).intValue());
                return null;
        }
    }

    public d1(mr.e eVar, ArrayList arrayList) {
        this.f4530a = 2;
        this.f4531b = arrayList;
    }
}
