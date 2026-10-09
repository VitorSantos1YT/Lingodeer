package xs;

import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f56230c = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f56231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56232b = 0;

    public final c a() {
        String strSubstring;
        if (this.f56232b >= this.f56231a.length()) {
            strSubstring = null;
        } else {
            int i11 = -1;
            while (this.f56232b < this.f56231a.length()) {
                if ((this.f56231a.charAt(this.f56232b) >= 'a' && this.f56231a.charAt(this.f56232b) <= 'z') || (this.f56231a.charAt(this.f56232b) >= 'A' && this.f56231a.charAt(this.f56232b) <= 'Z')) {
                    if (i11 != -1) {
                        break;
                    }
                    i11 = this.f56232b;
                }
                this.f56232b++;
            }
            if (i11 == -1) {
                throw new IllegalArgumentException();
            }
            strSubstring = this.f56231a.substring(i11, this.f56232b);
            this.f56231a.getClass();
        }
        if (strSubstring == null) {
            return null;
        }
        c cVar = new c();
        cVar.f56227c = new ArrayList();
        cVar.f56226b = Character.isUpperCase(strSubstring.charAt(0));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring.charAt(0));
        String str = MzwEyWCkjXL.JaBPPtyGpRW;
        sb2.append(str);
        cVar.f56225a = sb2.toString().toLowerCase();
        if (!strSubstring.substring(1).equals(str)) {
            ArrayList arrayList = new ArrayList();
            Matcher matcher = f56230c.matcher(strSubstring);
            for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
                arrayList.add(Float.valueOf(Float.parseFloat(matcher.group())));
            }
            if (cVar.f56225a.equals("v")) {
                cVar.f56227c.add(new d(CropImageView.DEFAULT_ASPECT_RATIO, ((Float) arrayList.get(0)).floatValue()));
                return cVar;
            }
            if (cVar.f56225a.equals("h")) {
                cVar.f56227c.add(new d(((Float) arrayList.get(0)).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO));
                return cVar;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12 += 2) {
                try {
                    cVar.f56227c.add(new d(((Float) arrayList.get(i12)).floatValue(), ((Float) arrayList.get(i12 + 1)).floatValue()));
                } catch (IndexOutOfBoundsException e8) {
                    e8.printStackTrace();
                    return null;
                }
            }
        }
        return cVar;
    }
}
