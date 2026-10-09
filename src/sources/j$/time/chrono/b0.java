package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f34953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f34954b;

    public b0() {
    }

    public b0(byte b3, Object obj) {
        this.f34953a = b3;
        this.f34954b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b3 = this.f34953a;
        Object obj = this.f34954b;
        objectOutput.writeByte(b3);
        switch (b3) {
            case 1:
                objectOutput.writeUTF(((a) obj).q());
                return;
            case 2:
                e eVar = (e) obj;
                objectOutput.writeObject(eVar.f34958a);
                objectOutput.writeObject(eVar.f34959b);
                return;
            case 3:
                i iVar = (i) obj;
                objectOutput.writeObject(iVar.f34970a);
                objectOutput.writeObject(iVar.f34971b);
                objectOutput.writeObject(iVar.f34972c);
                return;
            case 4:
                u uVar = (u) obj;
                uVar.getClass();
                objectOutput.writeInt(uVar.get(ChronoField.YEAR));
                objectOutput.writeByte(uVar.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(uVar.get(ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((v) obj).f35000a);
                return;
            case 6:
                n nVar = (n) obj;
                objectOutput.writeObject(nVar.f34984a);
                objectOutput.writeInt(nVar.get(ChronoField.YEAR));
                objectOutput.writeByte(nVar.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(nVar.get(ChronoField.DAY_OF_MONTH));
                return;
            case 7:
                z zVar = (z) obj;
                zVar.getClass();
                objectOutput.writeInt(zVar.get(ChronoField.YEAR));
                objectOutput.writeByte(zVar.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(zVar.get(ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                objectOutput.writeInt(f0Var.get(ChronoField.YEAR));
                objectOutput.writeByte(f0Var.get(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(f0Var.get(ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                f fVar = (f) obj;
                objectOutput.writeUTF(fVar.f34962a.q());
                objectOutput.writeInt(fVar.f34963b);
                objectOutput.writeInt(fVar.f34964c);
                objectOutput.writeInt(fVar.f34965d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objOf;
        byte b3 = objectInput.readByte();
        this.f34953a = b3;
        switch (b3) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.f34948a;
                objOf = Chronology.of(objectInput.readUTF());
                break;
            case 2:
                objOf = ((ChronoLocalDate) objectInput.readObject()).L((LocalTime) objectInput.readObject());
                break;
            case 3:
                objOf = ((ChronoLocalDateTime) objectInput.readObject()).G((ZoneOffset) objectInput.readObject()).F((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = u.f34994d;
                int i11 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                s.f34992d.getClass();
                objOf = new u(LocalDate.of(i11, b11, b12));
                break;
            case 5:
                v vVar = v.f34998d;
                objOf = v.r(objectInput.readByte());
                break;
            case 6:
                l lVar = (l) objectInput.readObject();
                int i12 = objectInput.readInt();
                byte b13 = objectInput.readByte();
                byte b14 = objectInput.readByte();
                lVar.getClass();
                objOf = new n(lVar, i12, b13, b14);
                break;
            case 7:
                int i13 = objectInput.readInt();
                byte b15 = objectInput.readByte();
                byte b16 = objectInput.readByte();
                x.f35004d.getClass();
                objOf = new z(LocalDate.of(i13 + 1911, b15, b16));
                break;
            case 8:
                int i14 = objectInput.readInt();
                byte b17 = objectInput.readByte();
                byte b18 = objectInput.readByte();
                d0.f34957d.getClass();
                objOf = new f0(LocalDate.of(i14 - 543, b17, b18));
                break;
            case 9:
                int i15 = f.f34961e;
                objOf = new f(Chronology.of(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f34954b = objOf;
    }

    private Object readResolve() {
        return this.f34954b;
    }
}
