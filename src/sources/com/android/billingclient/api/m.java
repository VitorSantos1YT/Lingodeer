package com.android.billingclient.api;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements r7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f7554a;

    public m(int i11) {
        switch (i11) {
            case 2:
                this.f7554a = new ArrayList(2);
                break;
            case 3:
                this.f7554a = new ArrayList();
                break;
            default:
                this.f7554a = new ArrayList();
                break;
        }
    }

    @Override // r7.a
    public long a(long j11) {
        ArrayList arrayList = this.f7554a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j11 < ((u8.a) arrayList.get(0)).f52819b) {
            return ((u8.a) arrayList.get(0)).f52819b;
        }
        for (int i11 = 1; i11 < arrayList.size(); i11++) {
            u8.a aVar = (u8.a) arrayList.get(i11);
            long j12 = aVar.f52819b;
            long j13 = aVar.f52819b;
            if (j11 < j12) {
                long j14 = ((u8.a) arrayList.get(i11 - 1)).f52821d;
                return (j14 == -9223372036854775807L || j14 <= j11 || j14 >= j13) ? j13 : j14;
            }
        }
        long j15 = ((u8.a) Iterables.c(arrayList)).f52821d;
        if (j15 == -9223372036854775807L || j11 >= j15) {
            return Long.MIN_VALUE;
        }
        return j15;
    }

    @Override // r7.a
    public ImmutableList b(long j11) {
        int i11 = i(j11);
        if (i11 == 0) {
            return ImmutableList.s();
        }
        u8.a aVar = (u8.a) this.f7554a.get(i11 - 1);
        long j12 = aVar.f52821d;
        return (j12 == -9223372036854775807L || j11 < j12) ? aVar.f52818a : ImmutableList.s();
    }

    @Override // r7.a
    public long c(long j11) {
        ArrayList arrayList = this.f7554a;
        if (arrayList.isEmpty() || j11 < ((u8.a) arrayList.get(0)).f52819b) {
            return -9223372036854775807L;
        }
        for (int i11 = 1; i11 < arrayList.size(); i11++) {
            long j12 = ((u8.a) arrayList.get(i11)).f52819b;
            if (j11 == j12) {
                return j12;
            }
            if (j11 < j12) {
                u8.a aVar = (u8.a) arrayList.get(i11 - 1);
                long j13 = aVar.f52821d;
                return (j13 == -9223372036854775807L || j13 > j11) ? aVar.f52819b : j13;
            }
        }
        u8.a aVar2 = (u8.a) Iterables.c(arrayList);
        long j14 = aVar2.f52821d;
        return (j14 == -9223372036854775807L || j11 < j14) ? aVar2.f52819b : j14;
    }

    @Override // r7.a
    public void clear() {
        this.f7554a.clear();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // r7.a
    public boolean d(u8.a aVar, long j11) {
        boolean z11;
        ArrayList arrayList = this.f7554a;
        long j12 = aVar.f52819b;
        b7.a.d(j12 != -9223372036854775807L);
        if (j12 <= j11) {
            long j13 = aVar.f52821d;
            if (j13 == -9223372036854775807L || j11 < j13) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j12 >= ((u8.a) arrayList.get(size)).f52819b) {
                arrayList.add(size + 1, aVar);
                return z11;
            }
            if (((u8.a) arrayList.get(size)).f52819b <= j11) {
                z11 = false;
            }
        }
        arrayList.add(0, aVar);
        return z11;
    }

    @Override // r7.a
    public void e(long j11) {
        ArrayList arrayList = this.f7554a;
        int i11 = i(j11);
        if (i11 == 0) {
            return;
        }
        long j12 = ((u8.a) arrayList.get(i11 - 1)).f52821d;
        if (j12 == -9223372036854775807L || j12 >= j11) {
            i11--;
        }
        arrayList.subList(0, i11).clear();
    }

    public void f(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f7554a == null) {
            this.f7554a = new ArrayList();
        }
        if (this.f7554a.isEmpty()) {
            this.f7554a.addAll(list);
            return;
        }
        int size = this.f7554a.size() - 1;
        z00.y yVar = (z00.y) this.f7554a.get(size);
        z00.y yVar2 = (z00.y) list.get(0);
        int i11 = yVar.f58455c;
        int i12 = yVar.f58456d;
        if (i11 + i12 != yVar2.f58455c) {
            this.f7554a.addAll(list);
        } else {
            this.f7554a.set(size, new z00.y(yVar.f58453a, yVar.f58454b, i11, i12 + yVar2.f58456d));
            this.f7554a.addAll(list.subList(1, list.size()));
        }
    }

    public void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f(((z00.t) it.next()).d());
        }
    }

    public void h(Object obj) {
        ArrayList arrayList = this.f7554a;
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public int i(long j11) {
        ArrayList arrayList = this.f7554a;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (j11 < ((u8.a) arrayList.get(i11)).f52819b) {
                return i11;
            }
        }
        return arrayList.size();
    }
}
