package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhf {
    public static String a(zzei zzeiVar) {
        StringBuilder sb2 = new StringBuilder(zzeiVar.e());
        for (int i11 = 0; i11 < zzeiVar.e(); i11++) {
            byte b3 = zzeiVar.b(i11);
            if (b3 == 34) {
                sb2.append("\\\"");
            } else if (b3 == 39) {
                sb2.append("\\'");
            } else if (b3 != 92) {
                switch (b3) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (b3 < 32 || b3 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b3 >>> 6) & 3) + 48));
                            sb2.append((char) (((b3 >>> 3) & 7) + 48));
                            sb2.append((char) ((b3 & 7) + 48));
                        } else {
                            sb2.append((char) b3);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
