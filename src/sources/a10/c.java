package a10;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import w00.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f288h;

    public c(c cVar) {
        ArrayList arrayList = cVar.f281a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) cVar.f288h;
        LinkedHashSet linkedHashSet2 = w00.f.f54381u;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add((v00.a) w00.f.f54382v.get((Class) it.next()));
        }
        this.f281a = arrayList2;
        int i11 = 0;
        this.f288h = new b(0);
        this.f286f = cVar.f286f;
        ArrayList arrayList3 = cVar.f282b;
        this.f282b = arrayList3;
        ArrayList arrayList4 = cVar.f283c;
        this.f283c = arrayList4;
        ArrayList arrayList5 = cVar.f284d;
        this.f284d = arrayList5;
        HashSet hashSet = cVar.f285e;
        this.f285e = hashSet;
        this.f287g = cVar.f287g;
        new HashMap();
        ArrayList arrayList6 = new ArrayList(arrayList3);
        arrayList6.add(new x00.b(1));
        arrayList6.add(new x00.b(2));
        arrayList6.add(new x00.b(3));
        arrayList6.add(new x00.b(i11));
        arrayList6.add(new x00.b(4));
        HashMap map = new HashMap();
        Object[] objArr = {new x00.a('*'), new x00.a('_')};
        ArrayList arrayList7 = new ArrayList(2);
        for (int i12 = 0; i12 < 2; i12++) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            arrayList7.add(obj);
        }
        k.b(Collections.unmodifiableList(arrayList7), map);
        k.b(arrayList4, map);
        new ArrayList(arrayList5).add(new x00.f());
        BitSet bitSet = new BitSet();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            bitSet.set(((Character) it2.next()).charValue());
        }
        bitSet.set(33);
        Set setKeySet = map.keySet();
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it3 = setKeySet.iterator();
        while (it3.hasNext()) {
            bitSet2.set(((Character) it3.next()).charValue());
        }
        int size = arrayList6.size();
        while (i11 < size) {
            Object obj2 = arrayList6.get(i11);
            i11++;
            Iterator it4 = ((x00.b) obj2).a().iterator();
            while (it4.hasNext()) {
                bitSet2.set(((Character) it4.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
    }

    public c() {
        this.f281a = new ArrayList();
        this.f282b = new ArrayList();
        this.f283c = new ArrayList();
        this.f284d = new ArrayList();
        this.f286f = new ArrayList();
        this.f285e = new HashSet();
        this.f288h = w00.f.f54381u;
        this.f287g = a.NONE;
    }
}
