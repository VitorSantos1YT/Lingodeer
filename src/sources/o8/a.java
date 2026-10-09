package o8;

import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import defpackage.e;
import y6.b0;
import y6.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44734b;

    public a(String str, String str2) {
        this.f44733a = Ascii.d(str);
        this.f44734b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // y6.b0
    public final void b(z zVar) {
        String str = this.f44733a;
        str.getClass();
        byte b3 = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b3 = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b3 = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b3 = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b3 = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b3 = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b3 = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b3 = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b3 = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b3 = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b3 = 9;
                }
                break;
        }
        String str2 = this.f44734b;
        switch (b3) {
            case 0:
                Integer numG = Ints.g(str2);
                if (numG != null) {
                    zVar.f57389i = numG;
                }
                break;
            case 1:
                Integer numG2 = Ints.g(str2);
                if (numG2 != null) {
                    zVar.f57401v = numG2;
                }
                break;
            case 2:
                Integer numG3 = Ints.g(str2);
                if (numG3 != null) {
                    zVar.f57388h = numG3;
                }
                break;
            case 3:
                zVar.f57383c = str2;
                break;
            case 4:
                zVar.f57402w = str2;
                break;
            case 5:
                zVar.f57381a = str2;
                break;
            case 6:
                zVar.f57385e = str2;
                break;
            case 7:
                Integer numG4 = Ints.g(str2);
                if (numG4 != null) {
                    zVar.f57400u = numG4;
                }
                break;
            case 8:
                zVar.f57384d = str2;
                break;
            case 9:
                zVar.f57382b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f44733a.equals(aVar.f44733a) && this.f44734b.equals(aVar.f44734b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f44734b.hashCode() + e.d(527, 31, this.f44733a);
    }

    public final String toString() {
        return "VC: " + this.f44733a + "=" + this.f44734b;
    }
}
