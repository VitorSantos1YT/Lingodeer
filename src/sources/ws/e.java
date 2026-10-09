package ws;

import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f55211c = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f55212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55213b = 0;

    public final c a() {
        String strSubstring;
        if (this.f55213b >= this.f55212a.length()) {
            strSubstring = null;
        } else {
            int i11 = -1;
            while (this.f55213b < this.f55212a.length()) {
                if ((this.f55212a.charAt(this.f55213b) >= 'a' && this.f55212a.charAt(this.f55213b) <= 'z') || (this.f55212a.charAt(this.f55213b) >= 'A' && this.f55212a.charAt(this.f55213b) <= 'Z')) {
                    if (i11 != -1) {
                        break;
                    }
                    i11 = this.f55213b;
                }
                this.f55213b++;
            }
            if (i11 == -1) {
                throw new IllegalArgumentException();
            }
            strSubstring = this.f55212a.substring(i11, this.f55213b);
            this.f55212a.getClass();
        }
        if (strSubstring == null) {
            return null;
        }
        c cVar = new c();
        cVar.f55208c = new ArrayList();
        cVar.f55207b = Character.isUpperCase(strSubstring.charAt(0));
        cVar.f55206a = (strSubstring.charAt(0) + BuildConfig.VERSION_NAME).toLowerCase();
        if (!strSubstring.substring(1).equals(BuildConfig.VERSION_NAME)) {
            ArrayList arrayList = new ArrayList();
            Matcher matcher = f55211c.matcher(strSubstring);
            for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
                arrayList.add(Float.valueOf(Float.parseFloat(matcher.group())));
            }
            if (cVar.f55206a.equals("v")) {
                cVar.f55208c.add(new d(CropImageView.DEFAULT_ASPECT_RATIO, ((Float) arrayList.get(0)).floatValue()));
                return cVar;
            }
            if (cVar.f55206a.equals("h")) {
                cVar.f55208c.add(new d(((Float) arrayList.get(0)).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO));
                return cVar;
            }
            for (int i12 = 0; i12 < arrayList.size(); i12 += 2) {
                try {
                    cVar.f55208c.add(new d(((Float) arrayList.get(i12)).floatValue(), ((Float) arrayList.get(i12 + 1)).floatValue()));
                } catch (IndexOutOfBoundsException e8) {
                    e8.printStackTrace();
                    return null;
                }
            }
        }
        return cVar;
    }
}
