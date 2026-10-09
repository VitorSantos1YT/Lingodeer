package j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends ZoneId {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f35199d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient j$.time.zone.f f35201c;

    public static v Z(String str, boolean z11) {
        j$.time.zone.f fVarA;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = str.charAt(i11);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i11 == 0) && ((cCharAt < '0' || cCharAt > '9' || i11 == 0) && ((cCharAt != '~' || i11 == 0) && ((cCharAt != '.' || i11 == 0) && ((cCharAt != '_' || i11 == 0) && ((cCharAt != '+' || i11 == 0) && (cCharAt != '-' || i11 == 0))))))))) {
                    throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarA = j$.time.zone.i.a(str);
            } catch (j$.time.zone.g e8) {
                if (z11) {
                    throw e8;
                }
                fVarA = null;
            }
            return new v(str, fVarA);
        }
        throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public v(String str, j$.time.zone.f fVar) {
        this.f35200b = str;
        this.f35201c = fVar;
    }

    @Override // j$.time.ZoneId
    public final String q() {
        return this.f35200b;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f B() {
        j$.time.zone.f fVar = this.f35201c;
        return fVar != null ? fVar : j$.time.zone.i.a(this.f35200b);
    }

    private Object writeReplace() {
        return new q((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void W(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f35200b);
    }
}
