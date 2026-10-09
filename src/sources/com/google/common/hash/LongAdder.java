package com.google.common.hash;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
final class LongAdder extends Striped64 implements Serializable, LongAddable {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f17412c = 0;
        this.f17410a = null;
        this.f17411b = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(d());
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    @Override // com.google.common.hash.LongAddable
    public final void add(long j11) {
        boolean zA;
        int iNextInt;
        Striped64.Cell[] cellArr;
        boolean z11;
        int length;
        boolean z12;
        int length2;
        int length3;
        Striped64.Cell cell;
        Striped64.Cell[] cellArr2 = this.f17410a;
        if (cellArr2 == null) {
            long j12 = this.f17411b;
            if (a(j12, j12 + j11)) {
                return;
            }
        }
        ThreadLocal threadLocal = Striped64.f17406d;
        int[] iArr = (int[]) threadLocal.get();
        if (iArr == null || cellArr2 == null || (length3 = cellArr2.length) < 1 || (cell = cellArr2[(length3 - 1) & iArr[0]]) == null) {
            zA = true;
        } else {
            long j13 = cell.f17415a;
            zA = cell.a(j13, j13 + j11);
            if (zA) {
                return;
            }
        }
        if (iArr == null) {
            iArr = new int[1];
            threadLocal.set(iArr);
            iNextInt = Striped64.f17407e.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr[0] = iNextInt;
        } else {
            iNextInt = iArr[0];
        }
        while (true) {
            boolean z13 = false;
            while (true) {
                cellArr = this.f17410a;
                if (cellArr != null && (length = cellArr.length) > 0) {
                    Striped64.Cell cell2 = cellArr[(length - 1) & iNextInt];
                    if (cell2 != null) {
                        if (zA) {
                            long j14 = cell2.f17415a;
                            if (cell2.a(j14, j14 + j11)) {
                                return;
                            }
                            if (length < Striped64.f17408f && this.f17410a == cellArr) {
                                if (z13) {
                                    if (this.f17412c == 0 && b()) {
                                        break;
                                    }
                                } else {
                                    z13 = true;
                                }
                            }
                        } else {
                            zA = true;
                        }
                        int i11 = iNextInt ^ (iNextInt << 13);
                        int i12 = i11 ^ (i11 >>> 17);
                        iNextInt = i12 ^ (i12 << 5);
                        iArr[0] = iNextInt;
                    } else if (this.f17412c == 0) {
                        Striped64.Cell cell3 = new Striped64.Cell(j11);
                        if (this.f17412c == 0 && b()) {
                            try {
                                Striped64.Cell[] cellArr3 = this.f17410a;
                                if (cellArr3 == null || (length2 = cellArr3.length) <= 0) {
                                    z12 = false;
                                } else {
                                    int i13 = (length2 - 1) & iNextInt;
                                    if (cellArr3[i13] == null) {
                                        cellArr3[i13] = cell3;
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                }
                                this.f17412c = 0;
                                if (z12) {
                                    return;
                                }
                            } catch (Throwable th2) {
                                this.f17412c = 0;
                                throw th2;
                            }
                        }
                    }
                    z13 = false;
                    int i14 = iNextInt ^ (iNextInt << 13);
                    int i15 = i14 ^ (i14 >>> 17);
                    iNextInt = i15 ^ (i15 << 5);
                    iArr[0] = iNextInt;
                } else if (this.f17412c == 0 && this.f17410a == cellArr && b()) {
                    try {
                        if (this.f17410a == cellArr) {
                            Striped64.Cell[] cellArr4 = new Striped64.Cell[2];
                            cellArr4[iNextInt & 1] = new Striped64.Cell(j11);
                            this.f17410a = cellArr4;
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.f17412c = 0;
                        if (z11) {
                            return;
                        }
                    } catch (Throwable th3) {
                        this.f17412c = 0;
                        throw th3;
                    }
                } else {
                    long j15 = this.f17411b;
                    if (a(j15, j15 + j11)) {
                        return;
                    }
                }
            }
            try {
                if (this.f17410a == cellArr) {
                    Striped64.Cell[] cellArr5 = new Striped64.Cell[length << 1];
                    for (int i16 = 0; i16 < length; i16++) {
                        cellArr5[i16] = cellArr[i16];
                    }
                    this.f17410a = cellArr5;
                }
                this.f17412c = 0;
            } catch (Throwable th4) {
                this.f17412c = 0;
                throw th4;
            }
        }
    }

    public final long d() {
        long j11 = this.f17411b;
        Striped64.Cell[] cellArr = this.f17410a;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j11 += cell.f17415a;
                }
            }
        }
        return j11;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return d();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return d();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) d();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return d();
    }

    public final String toString() {
        return Long.toString(d());
    }
}
