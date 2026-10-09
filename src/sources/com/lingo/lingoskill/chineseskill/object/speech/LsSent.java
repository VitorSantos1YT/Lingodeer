package com.lingo.lingoskill.chineseskill.object.speech;

import com.lingodeer.data.env.Env;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LsSent implements Comparable<LsSent> {
    private String STRE;
    private String STRF;
    private String STRJ;
    private String STRK;
    private String STRS;
    public String STTR;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public int f21742id;
    public List<LsWord> words = new ArrayList();
    public int score = -1;

    public static LsSent create(Env env, int i11, JSONObject jSONObject) throws JSONException {
        if (jSONObject.toString().equals("{}")) {
            return null;
        }
        LsSent lsSent = new LsSent();
        lsSent.f21742id = i11;
        lsSent.STRE = jSONObject.getString("STRE");
        lsSent.STRF = jSONObject.getString("STRF");
        lsSent.STRJ = jSONObject.getString("STRJ");
        lsSent.STRK = jSONObject.getString("STRK");
        lsSent.STRS = jSONObject.getString("STRS");
        lsSent.STTR = lsSent.STRE;
        int i12 = env.locateLanguage;
        if (i12 == 0) {
            lsSent.STTR = lsSent.STRJ;
        } else if (i12 == 1) {
            lsSent.STTR = lsSent.STRK;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("Words");
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            LsWord lsWordCreate = LsWord.create(Integer.parseInt(next), jSONObject2.getJSONObject(next));
            if (lsWordCreate != null) {
                lsSent.words.add(lsWordCreate);
            }
        }
        Collections.sort(lsSent.words);
        return lsSent;
    }

    @Override // java.lang.Comparable
    public int compareTo(LsSent lsSent) {
        return this.f21742id - lsSent.f21742id;
    }
}
