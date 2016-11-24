const mongoose = require('mongoose');
const Schema = mongoose.Schema;

const itemSchema = new Schema({
    name: {
      type: String,
      required: true
    },
    desc: {
      type: String,
      required: true
    },
    optionals: [{
      name: String,
      values: Schema.Types.Mixed
    }]
  },
  {
    timestamps: true
  });

module.exports = itemSchema;
