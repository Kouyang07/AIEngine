package dev.kouyang.OpenAI.GPT;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Usage {
    //{
    //  "id": "cmpl-8bEkZaZ6FgHcv6g1OhlwFqojiWpD1",
    //  "object": "text_completion",
    //  "created": 1703885527,
    //  "model": "davinci",
    //  "choices": [
    //    {
    //      "text": " Welcome. Please have some tea.\n\n\"A-Are, then you won't complain?\" (Maiya)\n\n\"Hohoho, could it be you are brave? I really welcome that.\" (Kouma)\n\nKouma, who behaved carefree after shrinking, continued talking with a tone like that of a daughter-in-law (jyah). I was silently worried about Maiya.\n\n\"Un, a, then it will hardly be",
    //      "index": 0,
    //      "logprobs": null,
    //      "finish_reason": "length"
    //    }
    //  ],
    //  "usage": {
    //    "prompt_tokens": 8,
    //    "completion_tokens": 100,
    //    "total_tokens": 108
    //  }
    //}
    @JsonProperty("prompt_tokens")
    private String prompt_tokens;
    @JsonProperty("completion_tokens")
    private String completion_tokens;
    @JsonProperty("total_tokens")
    private String total_tokens;
}
