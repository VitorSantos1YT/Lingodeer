package q1;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class a implements Map.Entry, gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f47356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f47357c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f47355a = i11;
        this.f47356b = obj;
        this.f47357c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f47355a) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && kotlin.jvm.internal.m.a(entry.getKey(), this.f47356b) && kotlin.jvm.internal.m.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f47355a) {
            case 0:
                break;
        }
        return this.f47356b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f47355a) {
            case 0:
                break;
        }
        return this.f47357c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f47355a) {
            case 0:
                Object obj = this.f47356b;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f47355a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f47355a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f47356b);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
