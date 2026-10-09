package j$.time;

import j$.time.temporal.ChronoField;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f35139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f35140b;

    public q() {
    }

    public q(byte b3, Object obj) {
        this.f35139a = b3;
        this.f35140b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b3 = this.f35139a;
        Object obj = this.f35140b;
        objectOutput.writeByte(b3);
        switch (b3) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f34910a);
                objectOutput.writeInt(duration.f34911b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f34913a);
                objectOutput.writeInt(instant.f34914b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.f34917a);
                objectOutput.writeByte(localDate.f34918b);
                objectOutput.writeByte(localDate.f34919c);
                return;
            case 4:
                ((LocalTime) obj).j0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.f34922a;
                objectOutput.writeInt(localDate2.f34917a);
                objectOutput.writeByte(localDate2.f34918b);
                objectOutput.writeByte(localDate2.f34919c);
                localDateTime.f34923b.j0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.f34943a;
                LocalDate localDate3 = localDateTime2.f34922a;
                objectOutput.writeInt(localDate3.f34917a);
                objectOutput.writeByte(localDate3.f34918b);
                objectOutput.writeByte(localDate3.f34919c);
                localDateTime2.f34923b.j0(objectOutput);
                zonedDateTime.f34944b.f0(objectOutput);
                zonedDateTime.f34945c.W(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((v) obj).f35200b);
                return;
            case 8:
                ((ZoneOffset) obj).f0(objectOutput);
                return;
            case 9:
                o oVar = (o) obj;
                oVar.f35133a.j0(objectOutput);
                oVar.f35134b.f0(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f34934a;
                LocalDate localDate4 = localDateTime3.f34922a;
                objectOutput.writeInt(localDate4.f34917a);
                objectOutput.writeByte(localDate4.f34918b);
                objectOutput.writeByte(localDate4.f34919c);
                localDateTime3.f34923b.j0(objectOutput);
                offsetDateTime.f34935b.f0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((s) obj).f35144a);
                return;
            case 12:
                u uVar = (u) obj;
                objectOutput.writeInt(uVar.f35197a);
                objectOutput.writeByte(uVar.f35198b);
                return;
            case 13:
                l lVar = (l) obj;
                objectOutput.writeByte(lVar.f35128a);
                objectOutput.writeByte(lVar.f35129b);
                return;
            case 14:
                p pVar = (p) obj;
                objectOutput.writeInt(pVar.f35136a);
                objectOutput.writeInt(pVar.f35137b);
                objectOutput.writeInt(pVar.f35138c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b3 = objectInput.readByte();
        this.f35139a = b3;
        this.f35140b = a(b3, objectInput);
    }

    public static Object a(byte b3, ObjectInput objectInput) throws IOException {
        switch (b3) {
            case 1:
                Duration duration = Duration.f34909c;
                long j11 = objectInput.readLong();
                long j12 = objectInput.readInt();
                return Duration.B(Math.addExact(j11, Math.floorDiv(j12, 1000000000L)), (int) Math.floorMod(j12, 1000000000L));
            case 2:
                Instant instant = Instant.f34912c;
                return Instant.H(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.f34915d;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.e0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f34920c;
                LocalDate localDate2 = LocalDate.f34915d;
                return LocalDateTime.J(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.e0(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f34920c;
                LocalDate localDate3 = LocalDate.f34915d;
                LocalDateTime localDateTimeJ = LocalDateTime.J(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.e0(objectInput));
                ZoneOffset zoneOffsetE0 = ZoneOffset.e0(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetE0.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeJ, zoneId, zoneOffsetE0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i11 = v.f35199d;
                return ZoneId.H(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.e0(objectInput);
            case 9:
                int i12 = o.f35132c;
                return new o(LocalTime.e0(objectInput), ZoneOffset.e0(objectInput));
            case 10:
                int i13 = OffsetDateTime.f34933c;
                LocalDate localDate4 = LocalDate.f34915d;
                return new OffsetDateTime(LocalDateTime.J(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.e0(objectInput)), ZoneOffset.e0(objectInput));
            case 11:
                int i14 = s.f35143b;
                return s.w(objectInput.readInt());
            case 12:
                int i15 = u.f35196c;
                int i16 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                ChronoField.YEAR.Z(i16);
                ChronoField.MONTH_OF_YEAR.Z(b11);
                return new u(i16, b11);
            case 13:
                int i17 = l.f35127c;
                byte b12 = objectInput.readByte();
                byte b13 = objectInput.readByte();
                Month monthJ = Month.J(b12);
                Objects.requireNonNull(monthJ, "month");
                ChronoField.DAY_OF_MONTH.Z(b13);
                if (b13 <= monthJ.H()) {
                    return new l(monthJ.getValue(), b13);
                }
                throw new c("Illegal value for DayOfMonth field, value " + ((int) b13) + " is not valid for month " + monthJ.name());
            case 14:
                p pVar = p.f35135d;
                return p.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f35140b;
    }
}
