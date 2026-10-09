package m2;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import kotlin.jvm.internal.m;
import ob.e;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f40821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40822b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f40823c = new e(19);

    public a(XmlResourceParser xmlResourceParser) {
        this.f40821a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i11, float f5) {
        if (q4.a.e(this.f40821a, str)) {
            f5 = typedArray.getFloat(i11, f5);
        }
        b(typedArray.getChangingConfigurations());
        return f5;
    }

    public final void b(int i11) {
        this.f40822b = i11 | this.f40822b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f40821a, aVar.f40821a) && this.f40822b == aVar.f40822b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40822b) + (this.f40821a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f40821a);
        sb2.append(", config=");
        return ep.a.j(sb2, this.f40822b, ')');
    }
}
