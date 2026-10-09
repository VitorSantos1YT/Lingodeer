package t1;

import l1.e3;
import l1.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends q1.e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i f51991t;

    @Override // q1.e, o1.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final i build() {
        q1.l lVar = this.f47368c;
        i iVar = this.f51991t;
        if (lVar != iVar.f47361a) {
            this.f47367b = new s1.b();
            iVar = new i(this.f47368c, this.f47371f);
        }
        this.f51991t = iVar;
        return iVar;
    }

    @Override // q1.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof v1) {
            return super.containsKey((v1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof e3) {
            return super.containsValue((e3) obj);
        }
        return false;
    }

    @Override // q1.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof v1) {
            return (e3) super.get((v1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof v1) ? obj2 : (e3) super.getOrDefault((v1) obj, (e3) obj2);
    }

    @Override // q1.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof v1) {
            return (e3) super.remove((v1) obj);
        }
        return null;
    }
}
