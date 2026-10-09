package oz;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ry.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends ry.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46165a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46166b;

    public j(List delegate) {
        kotlin.jvm.internal.m.f(delegate, "delegate");
        this.f46166b = delegate;
    }

    @Override // ry.a
    public final int b() {
        switch (this.f46165a) {
            case 0:
                return ((l) this.f46166b).f46169a.groupCount() + 1;
            default:
                return ((List) this.f46166b).size();
        }
    }

    @Override // ry.a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f46165a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i11) {
        switch (this.f46165a) {
            case 0:
                String strGroup = ((l) this.f46166b).f46169a.group(i11);
                return strGroup == null ? BuildConfig.VERSION_NAME : strGroup;
            default:
                return ((List) this.f46166b).get(ry.m.a0(i11, this));
        }
    }

    @Override // ry.e, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f46165a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // ry.e, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f46165a) {
            case 1:
                return new y(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // ry.e, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f46165a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // ry.e, java.util.List
    public ListIterator listIterator() {
        switch (this.f46165a) {
            case 1:
                return new y(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // ry.e, java.util.List
    public ListIterator listIterator(int i11) {
        switch (this.f46165a) {
            case 1:
                return new y(this, i11);
            default:
                return super.listIterator(i11);
        }
    }

    public j(l lVar) {
        this.f46166b = lVar;
    }
}
