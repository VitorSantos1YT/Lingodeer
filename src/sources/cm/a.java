package cm;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f7184b;

    public /* synthetic */ a(int i11) {
        this.f7183a = i11;
    }

    public static a b(String str) {
        a aVar = new a(1);
        aVar.f7184b = new HashMap();
        try {
            for (String str2 : str.split(";")) {
                String[] strArrSplit = str2.split(":");
                aVar.f7184b.put(Long.valueOf(Long.parseLong(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
            }
            return aVar;
        } catch (Exception unused) {
            aVar.f7184b.clear();
            return aVar;
        }
    }

    public String a(String str) {
        switch (this.f7183a) {
            case 0:
                HashMap map = this.f7184b;
                if (map.containsKey(str)) {
                    return (String) map.get(str);
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < str.length(); i11++) {
                    String strValueOf = String.valueOf(str.charAt(i11));
                    if (map.containsKey(strValueOf)) {
                        strValueOf = (String) map.get(strValueOf);
                    }
                    sb2.append(strValueOf);
                }
                return sb2.toString().trim();
            case 1:
            default:
                HashMap map2 = this.f7184b;
                StringBuilder sb3 = new StringBuilder();
                for (int i12 = 0; i12 < str.length(); i12++) {
                    String strValueOf2 = String.valueOf(str.charAt(i12));
                    if (map2.containsKey(strValueOf2)) {
                        strValueOf2 = (String) map2.get(strValueOf2);
                    }
                    sb3.append(strValueOf2);
                }
                return sb3.toString().trim();
            case 2:
                HashMap map3 = this.f7184b;
                if (map3.containsKey(str)) {
                    return (String) map3.get(str);
                }
                StringBuilder sb4 = new StringBuilder();
                for (int i13 = 0; i13 < str.length(); i13++) {
                    String strValueOf3 = String.valueOf(str.charAt(i13));
                    if (map3.containsKey(strValueOf3)) {
                        strValueOf3 = (String) map3.get(strValueOf3);
                    }
                    sb4.append(strValueOf3);
                }
                return sb4.toString().trim();
        }
    }

    public a() {
        this.f7183a = 3;
        HashMap map = new HashMap();
        this.f7184b = map;
        map.clear();
        for (String str : "A=a\nÀ=a1\nẢ=a2\nÃ=a3\nÁ=a4\nẠ=a5\na=a\nà=a1\nả=a2\nã=a3\ná=a4\nạ=a5\nĂ=#1\nẰ=#11\nẲ=#12\nẴ=#13\nẮ=#14\nẶ=#15\nă=#1\nằ=#11\nẳ=#12\nẵ=#13\nắ=#14\nặ=#15\nÂ=#2\nẦ=#21\nẨ=#22\nẪ=#23\nẤ=#24\nẬ=#25\nâ=#2\nầ=#21\nẩ=#22\nẫ=#23\nấ=#24\nậ=#25\nB=b\nb=b\nC=c\nc=c\nD=d\nd=d\nĐ=#3\nđ=#3\nE=e\nÈ=e1\nẺ=e2\nẼ=e3\nÉ=e4\nẸ=e5\ne=e\nè=e1\nẻ=e2\nẽ=e3\né=e4\nẹ=e5\nÊ=#4\nỀ=#41\nỂ=#42\nỄ=#43\nẾ=#44\nỆ=#45\nê=#4\nề=#41\nể=#42\nễ=#43\nế=#44\nệ=#45\nG=g\ng=g\nH=h\nh=h\nI=i\nÌ=i1\nỈ=i2\nĨ=i3\nÍ=i4\nỊ=i5\ni=i\nì=i1\nỉ=i2\nĩ=i3\ní=i4\nị=i5\nK=k\nk=k\nL=l\nl=l\nM=m\nm=m\nN=n\nn=n\nO=o\nÒ=o1\nỎ=o2\nÕ=o3\nÓ=o4\nỌ=o5\no=o\nò=o1\nỏ=o2\nõ=o3\nó=o4\nọ=o5\nÔ=#5\nỒ=#51\nỔ=#52\nỖ=#53\nỐ=#54\nỘ=#55\nô=#5\nồ=#51\nổ=#52\nỗ=#53\nố=#54\nộ=#55\nƠ=#6\nỜ=#61\nỞ=#62\nỠ=#63\nỚ=#64\nỢ=#65\nơ=#6\nờ=#61\nở=#62\nỡ=#63\nớ=#64\nợ=#65\nP=p\np=p\nQ=q\nq=q\nR=r\nr=r\nS=s\ns=s\nT=t\nt=t\nU=u\nÙ=u1\nỦ=u2\nŨ=u3\nÚ=u4\nỤ=u5\nu=u\nù=u1\nủ=u2\nũ=u3\nú=u4\nụ=u5\nƯ=#7\nỪ=#71\nỬ=#72\nỮ=#73\nỮ=#74\nỰ=#75\nư=#7\nừ=#71\nử=#72\nữ=#73\nứ=#74\nự=#75\nV=v\nv=v\nX=x\nx=x\nY=y\nỲ=y1\nỶ=y2\nỸ=y3\nÝ=y4\nỴ=y5\ny=y\nỳ=y1\nỷ=y2\nỹ=y3\ný=y4\nỵ=y5".split("\n")) {
            String[] strArrSplit = str.split("=");
            this.f7184b.put(strArrSplit[0], strArrSplit[1]);
        }
    }
}
