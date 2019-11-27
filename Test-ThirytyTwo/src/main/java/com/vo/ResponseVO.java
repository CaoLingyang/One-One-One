package com.vo;

import lombok.Data;

@Data
public class ResponseVO {
     private String code;
     private String msg;
     private Object data;

    private ResponseVO(Builder builder) {
        this.code = builder.code;
        this.msg = builder.msg;
        this.data = builder.data;
    }

    public static Builder newResponseVO() {
        return new Builder();
    }


    public static final class Builder {
        private String code;
        private String msg;
        private Object data;

        private Builder() {
        }

        public ResponseVO build() {
            return new ResponseVO(this);
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public Builder data(Object data) {
            this.data = data;
            return this;
        }
    }

    ResponseVO responseVO=ResponseVO.newResponseVO()
            .code("200")
            .data(null)
            .msg("succecs")
            .build();
}
