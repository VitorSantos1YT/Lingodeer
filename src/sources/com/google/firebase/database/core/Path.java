package com.google.firebase.database.core;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.snapshot.ChildKey;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Path implements Iterable<ChildKey>, Comparable<Path> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Path f19210d = new Path(BuildConfig.VERSION_NAME);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChildKey[] f19211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19213c;

    /* JADX INFO: renamed from: com.google.firebase.database.core.Path$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Iterator<ChildKey> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19214a;

        public AnonymousClass1() {
            this.f19214a = Path.this.f19212b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19214a < Path.this.f19213c;
        }

        @Override // java.util.Iterator
        public final ChildKey next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements.");
            }
            ChildKey[] childKeyArr = Path.this.f19211a;
            int i11 = this.f19214a;
            ChildKey childKey = childKeyArr[i11];
            this.f19214a = i11 + 1;
            return childKey;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }

    public Path(ChildKey... childKeyArr) {
        this.f19211a = (ChildKey[]) Arrays.copyOf(childKeyArr, childKeyArr.length);
        this.f19212b = 0;
        this.f19213c = childKeyArr.length;
        for (ChildKey childKey : childKeyArr) {
            char[] cArr = Utilities.f19432a;
        }
    }

    public static Path m(Path path, Path path2) {
        ChildKey childKeyK = path.k();
        ChildKey childKeyK2 = path2.k();
        if (childKeyK == null) {
            return path2;
        }
        if (childKeyK.equals(childKeyK2)) {
            return m(path.n(), path2.n());
        }
        throw new DatabaseException("INTERNAL ERROR: " + path2 + " is not contained in " + path);
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(size());
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        while (anonymousClass1.hasNext()) {
            arrayList.add(((ChildKey) anonymousClass1.next()).f19513a);
        }
        return arrayList;
    }

    public final Path e(Path path) {
        int size = path.size() + size();
        ChildKey[] childKeyArr = new ChildKey[size];
        System.arraycopy(this.f19211a, this.f19212b, childKeyArr, 0, size());
        System.arraycopy(path.f19211a, path.f19212b, childKeyArr, size(), path.size());
        return new Path(childKeyArr, 0, size);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Path)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Path path = (Path) obj;
        if (size() != path.size()) {
            return false;
        }
        int i11 = this.f19212b;
        for (int i12 = path.f19212b; i11 < this.f19213c && i12 < path.f19213c; i12++) {
            if (!this.f19211a[i11].equals(path.f19211a[i12])) {
                return false;
            }
            i11++;
        }
        return true;
    }

    public final Path f(ChildKey childKey) {
        int size = size();
        int i11 = size + 1;
        ChildKey[] childKeyArr = new ChildKey[i11];
        System.arraycopy(this.f19211a, this.f19212b, childKeyArr, 0, size);
        childKeyArr[size] = childKey;
        return new Path(childKeyArr, 0, i11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Path path) {
        int i11;
        int i12 = path.f19212b;
        int i13 = path.f19213c;
        int i14 = this.f19212b;
        while (true) {
            i11 = this.f19213c;
            if (i14 >= i11 || i12 >= i13) {
                break;
            }
            int iCompareTo = this.f19211a[i14].compareTo(path.f19211a[i12]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i14++;
            i12++;
        }
        if (i14 == i11 && i12 == i13) {
            return 0;
        }
        return i14 == i11 ? -1 : 1;
    }

    public final boolean h(Path path) {
        if (size() > path.size()) {
            return false;
        }
        int i11 = path.f19212b;
        int i12 = this.f19212b;
        while (i12 < this.f19213c) {
            if (!this.f19211a[i12].equals(path.f19211a[i11])) {
                return false;
            }
            i12++;
            i11++;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (int i11 = this.f19212b; i11 < this.f19213c; i11++) {
            iHashCode = (iHashCode * 37) + this.f19211a[i11].f19513a.hashCode();
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f19212b >= this.f19213c;
    }

    @Override // java.lang.Iterable
    public final Iterator<ChildKey> iterator() {
        return new AnonymousClass1();
    }

    public final ChildKey j() {
        if (isEmpty()) {
            return null;
        }
        return this.f19211a[this.f19213c - 1];
    }

    public final ChildKey k() {
        if (isEmpty()) {
            return null;
        }
        return this.f19211a[this.f19212b];
    }

    public final Path l() {
        if (isEmpty()) {
            return null;
        }
        return new Path(this.f19211a, this.f19212b, this.f19213c - 1);
    }

    public final Path n() {
        boolean zIsEmpty = isEmpty();
        int i11 = this.f19212b;
        if (!zIsEmpty) {
            i11++;
        }
        return new Path(this.f19211a, i11, this.f19213c);
    }

    public final String o() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f19212b;
        for (int i12 = i11; i12 < this.f19213c; i12++) {
            if (i12 > i11) {
                sb2.append("/");
            }
            sb2.append(this.f19211a[i12].f19513a);
        }
        return sb2.toString();
    }

    public final int size() {
        return this.f19213c - this.f19212b;
    }

    public final String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = this.f19212b; i11 < this.f19213c; i11++) {
            sb2.append("/");
            sb2.append(this.f19211a[i11].f19513a);
        }
        return sb2.toString();
    }

    public Path(List list) {
        this.f19211a = new ChildKey[list.size()];
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            this.f19211a[i11] = ChildKey.b((String) it.next());
            i11++;
        }
        this.f19212b = 0;
        this.f19213c = list.size();
    }

    public Path(String str) {
        String[] strArrSplit = str.split("/", -1);
        int i11 = 0;
        for (String str2 : strArrSplit) {
            if (str2.length() > 0) {
                i11++;
            }
        }
        this.f19211a = new ChildKey[i11];
        int i12 = 0;
        for (String str3 : strArrSplit) {
            if (str3.length() > 0) {
                this.f19211a[i12] = ChildKey.b(str3);
                i12++;
            }
        }
        this.f19212b = 0;
        this.f19213c = this.f19211a.length;
    }

    public Path(ChildKey[] childKeyArr, int i11, int i12) {
        this.f19211a = childKeyArr;
        this.f19212b = i11;
        this.f19213c = i12;
    }
}
