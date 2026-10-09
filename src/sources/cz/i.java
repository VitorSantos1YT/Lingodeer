package cz;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import nz.l;
import ry.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22620c;

    public /* synthetic */ i(int i11, Object obj, Object obj2) {
        this.f22618a = i11;
        this.f22619b = obj;
        this.f22620c = obj2;
    }

    @Override // nz.l
    public final Iterator iterator() {
        switch (this.f22618a) {
            case 0:
                return new g(this);
            case 1:
                return new nz.k(this);
            default:
                nz.i iVar = (nz.i) this.f22619b;
                ArrayList arrayList = new ArrayList();
                nz.g gVar = new nz.g(iVar);
                while (gVar.hasNext()) {
                    arrayList.add(gVar.next());
                }
                p.Z(arrayList, (Comparator) this.f22620c);
                return arrayList.iterator();
        }
    }

    public i(File file, j direction) {
        this.f22618a = 0;
        m.f(direction, "direction");
        this.f22619b = file;
        this.f22620c = direction;
    }
}
