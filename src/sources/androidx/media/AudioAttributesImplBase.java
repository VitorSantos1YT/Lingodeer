package androidx.media;

import com.chad.library.adapter.base.BaseQuickAdapter;
import java.util.Arrays;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2106a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2107b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2108c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2109d = -1;

    public final boolean equals(Object obj) {
        int i11;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2107b == audioAttributesImplBase.f2107b) {
            int i12 = this.f2108c;
            int i13 = audioAttributesImplBase.f2108c;
            int i14 = audioAttributesImplBase.f2109d;
            if (i14 == -1) {
                int i15 = audioAttributesImplBase.f2106a;
                int i16 = AudioAttributesCompat.f2102b;
                if ((i13 & 1) != 1) {
                    i11 = 4;
                    if ((i13 & 4) != 4) {
                        switch (i15) {
                            case 2:
                                i11 = 0;
                                break;
                            case 3:
                                i11 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i11 = 5;
                                break;
                            case 6:
                                i11 = 2;
                                break;
                            case 11:
                                i11 = 10;
                                break;
                            case 12:
                            default:
                                i11 = 3;
                                break;
                            case 13:
                                i11 = 1;
                                break;
                        }
                    } else {
                        i11 = 6;
                    }
                } else {
                    i11 = 7;
                }
            } else {
                i11 = i14;
            }
            if (i11 == 6) {
                i13 |= 4;
            } else if (i11 == 7) {
                i13 |= 1;
            }
            if (i12 == (i13 & BaseQuickAdapter.HEADER_VIEW) && this.f2106a == audioAttributesImplBase.f2106a && this.f2109d == i14) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2107b), Integer.valueOf(this.f2108c), Integer.valueOf(this.f2106a), Integer.valueOf(this.f2109d)});
    }

    public final String toString() {
        String strJ;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f2109d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f2109d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i11 = this.f2106a;
        int i12 = AudioAttributesCompat.f2102b;
        switch (i11) {
            case 0:
                strJ = "USAGE_UNKNOWN";
                break;
            case 1:
                strJ = "USAGE_MEDIA";
                break;
            case 2:
                strJ = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strJ = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strJ = "USAGE_ALARM";
                break;
            case 5:
                strJ = "USAGE_NOTIFICATION";
                break;
            case 6:
                strJ = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strJ = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strJ = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strJ = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strJ = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strJ = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strJ = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strJ = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strJ = "USAGE_GAME";
                break;
            case 15:
            default:
                strJ = p.j(i11, "unknown usage ");
                break;
            case 16:
                strJ = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strJ);
        sb2.append(" content=");
        sb2.append(this.f2107b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f2108c).toUpperCase());
        return sb2.toString();
    }
}
