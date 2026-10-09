package g00;

import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements c00.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f28356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f28357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qy.q f28358c;

    public a0(String str, Enum[] values) {
        kotlin.jvm.internal.m.f(values, "values");
        this.f28356a = values;
        this.f28358c = com.bumptech.glide.d.v(new fp.f(3, this, str));
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        int iZ = cVar.z(getDescriptor());
        Enum[] enumArr = this.f28356a;
        if (iZ >= 0 && iZ < enumArr.length) {
            return enumArr[iZ];
        }
        throw new SerializationException(iZ + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return (e00.g) this.f28358c.getValue();
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        Enum value = (Enum) obj;
        kotlin.jvm.internal.m.f(value, "value");
        Enum[] enumArr = this.f28356a;
        int iZ = ry.l.Z(enumArr, value);
        if (iZ != -1) {
            dVar.s(getDescriptor(), iZ);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().a());
        sb2.append(", must be one of ");
        String string = Arrays.toString(enumArr);
        kotlin.jvm.internal.m.e(string, "toString(...)");
        sb2.append(string);
        throw new SerializationException(sb2.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }
}
