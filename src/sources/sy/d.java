package sy;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends f implements Iterator, gz.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51936e;

    public d(g map, int i11) {
        this.f51936e = i11;
        m.f(map, "map");
        this.f51943d = map;
        this.f51941b = -1;
        this.f51942c = map.H;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f51936e) {
            case 0:
                b();
                int i11 = this.f51940a;
                g gVar = (g) this.f51943d;
                if (i11 >= gVar.f51949f) {
                    throw new NoSuchElementException();
                }
                this.f51940a = i11 + 1;
                this.f51941b = i11;
                e eVar = new e(gVar, i11);
                e();
                return eVar;
            case 1:
                b();
                int i12 = this.f51940a;
                g gVar2 = (g) this.f51943d;
                if (i12 >= gVar2.f51949f) {
                    throw new NoSuchElementException();
                }
                this.f51940a = i12 + 1;
                this.f51941b = i12;
                Object obj = gVar2.f51944a[i12];
                e();
                return obj;
            default:
                b();
                int i13 = this.f51940a;
                g gVar3 = (g) this.f51943d;
                if (i13 >= gVar3.f51949f) {
                    throw new NoSuchElementException();
                }
                this.f51940a = i13 + 1;
                this.f51941b = i13;
                Object[] objArr = gVar3.f51945b;
                m.c(objArr);
                Object obj2 = objArr[this.f51941b];
                e();
                return obj2;
        }
    }
}
