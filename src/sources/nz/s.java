package nz;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements Iterator, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f44346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44347c;

    public s(e00.i iVar) {
        this.f44345a = 1;
        this.f44347c = new ArrayList();
        this.f44346b = iVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f44345a) {
            case 0:
                break;
        }
        return this.f44346b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f44345a) {
            case 0:
                return ((t) this.f44347c).f44349b.invoke(this.f44346b.next());
            default:
                Object next = this.f44346b.next();
                ArrayList arrayList = (ArrayList) this.f44347c;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                e00.i iVar = viewGroup != null ? new e00.i(viewGroup, 8) : null;
                if (iVar == null || !iVar.hasNext()) {
                    while (!this.f44346b.hasNext() && !arrayList.isEmpty()) {
                        this.f44346b = (Iterator) ry.m.z0(arrayList);
                        ry.m.M0(arrayList);
                    }
                } else {
                    arrayList.add(this.f44346b);
                    this.f44346b = iVar;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f44345a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s(t tVar) {
        this.f44345a = 0;
        this.f44347c = tVar;
        this.f44346b = tVar.f44348a.iterator();
    }
}
