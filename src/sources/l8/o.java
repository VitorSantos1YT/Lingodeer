package l8;

import b7.f0;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import y6.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableList f39838c;

    /* JADX WARN: Multi-variable type inference failed */
    public o(List list, String str, String str2) {
        super(str);
        b7.a.d(!((AbstractCollection) list).isEmpty());
        this.f39837b = str2;
        ImmutableList immutableListN = ImmutableList.n(list);
        this.f39838c = immutableListN;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y6.b0
    public final void b(z zVar) {
        byte b3;
        switch (this.f39825a) {
            case "TAL":
                b3 = 0;
                break;
            case "TCM":
                b3 = 1;
                break;
            case "TDA":
                b3 = 2;
                break;
            case "TP1":
                b3 = 3;
                break;
            case "TP2":
                b3 = 4;
                break;
            case "TP3":
                b3 = 5;
                break;
            case "TRK":
                b3 = 6;
                break;
            case "TT2":
                b3 = 7;
                break;
            case "TXT":
                b3 = 8;
                break;
            case "TYE":
                b3 = 9;
                break;
            case "TALB":
                b3 = 10;
                break;
            case "TCOM":
                b3 = 11;
                break;
            case "TCON":
                b3 = 12;
                break;
            case "TDAT":
                b3 = 13;
                break;
            case "TDRC":
                b3 = 14;
                break;
            case "TDRL":
                b3 = 15;
                break;
            case "TEXT":
                b3 = 16;
                break;
            case "TIT2":
                b3 = 17;
                break;
            case "TPE1":
                b3 = 18;
                break;
            case "TPE2":
                b3 = 19;
                break;
            case "TPE3":
                b3 = 20;
                break;
            case "TRCK":
                b3 = 21;
                break;
            case "TYER":
                b3 = 22;
                break;
            default:
                b3 = -1;
                break;
        }
        ImmutableList immutableList = this.f39838c;
        try {
            switch (b3) {
                case 0:
                case 10:
                    zVar.f57383c = (CharSequence) immutableList.get(0);
                    break;
                case 1:
                case 11:
                    zVar.f57398s = (CharSequence) immutableList.get(0);
                    break;
                case 2:
                case 13:
                    String str = (String) immutableList.get(0);
                    int i11 = Integer.parseInt(str.substring(2, 4));
                    int i12 = Integer.parseInt(str.substring(0, 2));
                    zVar.m = Integer.valueOf(i11);
                    zVar.f57393n = Integer.valueOf(i12);
                    break;
                case 3:
                case 18:
                    zVar.f57382b = (CharSequence) immutableList.get(0);
                    break;
                case 4:
                case 19:
                    zVar.f57384d = (CharSequence) immutableList.get(0);
                    break;
                case 5:
                case 20:
                    zVar.f57399t = (CharSequence) immutableList.get(0);
                    break;
                case 6:
                case 21:
                    String str2 = (String) immutableList.get(0);
                    String str3 = f0.f3975a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i13 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    zVar.f57388h = Integer.valueOf(i13);
                    zVar.f57389i = numValueOf;
                    break;
                case 7:
                case 17:
                    zVar.f57381a = (CharSequence) immutableList.get(0);
                    break;
                case 8:
                case 16:
                    zVar.f57397r = (CharSequence) immutableList.get(0);
                    break;
                case 9:
                case 22:
                    zVar.f57392l = Integer.valueOf(Integer.parseInt((String) immutableList.get(0)));
                    break;
                case 12:
                    Integer numG = Ints.g((String) immutableList.get(0));
                    if (numG != null) {
                        String strA = k.a(numG.intValue());
                        if (strA != null) {
                            zVar.f57402w = strA;
                        }
                    } else {
                        zVar.f57402w = (CharSequence) immutableList.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) immutableList.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                zVar.f57393n = (Integer) arrayListD.get(2);
                            }
                        }
                        zVar.m = (Integer) arrayListD.get(1);
                    }
                    zVar.f57392l = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) immutableList.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                zVar.f57396q = (Integer) arrayListD2.get(2);
                            }
                        }
                        zVar.f57395p = (Integer) arrayListD2.get(1);
                    }
                    zVar.f57394o = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (Objects.equals(this.f39825a, oVar.f39825a) && Objects.equals(this.f39837b, oVar.f39837b) && this.f39838c.equals(oVar.f39838c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = defpackage.e.d(527, 31, this.f39825a);
        String str = this.f39837b;
        return this.f39838c.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // l8.j
    public final String toString() {
        return this.f39825a + ": description=" + this.f39837b + ": values=" + this.f39838c;
    }
}
